import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MySQLParksDao implements Parks {

    private Connection connection;
    private Config config = new Config();
    public MySQLParksDao(){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }catch (Exception e){
            throw new RuntimeException("error connecting to database");
        }
    }

    public List<Park> allParks(){
        try {
            Statement stmt = connection.createStatement();
            String selectParks = "SELECT * FROM national_parks";

            ResultSet rs = stmt.executeQuery(selectParks);
            List<Park> parks = new ArrayList<>();

            while (rs.next()){
//                System.out.println("Id: " + rs.getLong("id"));
//                System.out.println("name: " + rs.getString("name"));

                parks.add(new Park(rs.getLong("id"), rs.getString("name"),
                        rs.getString("description"), rs.getString("description")));

            }


            return parks;
        }catch (Exception e){
            throw new RuntimeException("Error creating statement");
        }
    }

    @Override
    public void insertPark(String name, String description, String location) {
        try {
            Statement stmt = connection.createStatement();

            String insertQuery = String.format("INSERT INTO national_parks(name, description, location) VALUES('%s','%s','%s')", name, description, location);

            // Will return the newly generated ID of the inserted record
            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = stmt.getGeneratedKeys();
            // confirm that the new record exists
            if(rs.next()) {
                System.out.println("New Record has been inserted!");
            }
        }catch (Exception e){
            throw new RuntimeException("error adding to parks db");
        }
    }
}
