package doa;

import com.mysql.cj.jdbc.Driver;
import models.Ad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

//    ********* INSTANCES ********
    Connection connection;
//    doa.Config config = new doa.Config();

//    ******* CONSTRUCTOR *********


    public MySQLAdsDao(Config config) {
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

//    ***** USING all() METHOD FROM doa.Ads INTERFACE *******
    public List<Ad> all(){
        try {
            Statement stmt = connection.createStatement();

            String selectAds = "SELECT * FROM ads_table";

            ResultSet rs = stmt.executeQuery(selectAds);
            List<Ad> ads = new ArrayList<>();

            while (rs.next()){
                ads.add(new Ad(rs.getLong("id"), rs.getLong("user_id"), rs.getString("title"), rs.getString("description")));
            }

            return ads;

        }catch (Exception e){
            throw new RuntimeException("Error creating statement that retrieves ads data");
        }
    }

    @Override
    public Long insert(Ad ad) {

//        Long newAdId = 0L;
        try {


//            String insertQuery = String.format("INSERT INTO ads_table(title, description) VALUES('%s','%s')", title, description);
//
//            // Will return the newly generated ID of the inserted record
//            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
//
//            ResultSet rs = stmt.getGeneratedKeys();
//            // confirm that the new record exists
//            if(rs.next()) {
//                System.out.println("New Record has been inserted!");
//            }

//            Long id = ad.getUserId();
//            String title = ad.getTitle();
//            String desc = ad.getDescription();

//            String query = "INSERT INTO ads_table (user_id, title, description) VALUES(id, 'test title 1 ', 'test ad 1 desc')";
//            String insertQuery = String.format("INSERT INTO ads_table(title, description) VALUES('%d','%s','%s')", id, title, desc);

            Statement stmt = connection.createStatement();
            Long id = ad.getUserId();
            String title = ad.getTitle();
            String desc = ad.getDescription();

            String insertQuery = String.format("INSERT INTO ads_table(user_id, title, description) VALUES('%s','%s','%s')", id, title, desc);

            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                System.out.println("Inserted a new record! New id: " + rs.getLong(1));
//                newAdId = rs.getLong(1);
            }
            return rs.getLong(1);

        }catch (Exception e){
            throw new RuntimeException("Error inserting new models.Ad.");
        }

    }

//    @Override
//    public Long insert(models.Ad ad) {
//        return ad.getId();
//    }
}
