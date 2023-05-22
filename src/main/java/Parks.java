import java.util.List;

public interface Parks {
   List<Park> allParks();

   void insertPark(String name, String description, String location);
}
