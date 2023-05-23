import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

//    ********* INSTANCES ********
    Connection connection;
    Config config = new Config();

//    ******* CONSTRUCTOR *********


    public MySQLAdsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }catch (Exception e){
            throw new RuntimeException("Error connecting to database");
        }
    }

//    ***** USING all() METHOD FROM Ads INTERFACE *******
    public List<Ad> all(){
        try {
            Statement stmt = connection.createStatement();

            String selectAds = "SELECT * FROM ads_table";

            ResultSet rs = stmt.executeQuery(selectAds);
            List<Ad> ads = new ArrayList<>();

            while (rs.next()){
                ads.add(new Ad(rs.getLong("id"), rs.getString("title"), rs.getString("description")));
            }

            return ads;

        }catch (Exception e){
            throw new RuntimeException("Error creating statement that retrieves ads data");
        }
    }

    @Override
    public void insert(String title, String description) {
        try {
            Statement stmt = connection.createStatement();

            String insertQuery = String.format("INSERT INTO ads_table(title, description) VALUES('%s','%s')", title, description);

            // Will return the newly generated ID of the inserted record
            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = stmt.getGeneratedKeys();
            // confirm that the new record exists
            if(rs.next()) {
                System.out.println("New Record has been inserted!");
            }

        }catch (Exception e){
            throw new RuntimeException("Error inserting new Ad.");
        }
    }

//    @Override
//    public Long insert(Ad ad) {
//        return ad.getId();
//    }
}
