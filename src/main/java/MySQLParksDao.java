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
            Connection connection = DriverManager.getConnection(
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

           stmt.executeQuery("INSERT INTO national_parks(name, description, location) VALUES (" + name + "," + description + ","+ location + ")", Statement.RETURN_GENERATED_KEYS);
        }catch (Exception e){
            throw new RuntimeException("error adding to parks db");
        }
    }
}
