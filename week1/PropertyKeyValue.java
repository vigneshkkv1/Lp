
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class PropertyKeyValue { 
   public static void main(String args[]) throws IOException { 
      Properties props = new Properties();
      props.put("db_name", "MySQL_3306");
      props.put("db_username", "vignesh");
      props.put("db_port", "3306");
      props.put("db_URL", "jdbc:mysql://localhost:3306/vignesh/kkv");
      String path = "D:\\mydbFile.properties";
      FileOutputStream outputStrem = new FileOutputStream(path);
      props.store(outputStrem, "This is a sample properties file");
      System.out.println("created!");
   }
}