import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class ReadPropertyFile {
    public static void main(String[] args) {
        try (InputStream input = new FileInputStream("path/to/config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            System.out.println(prop.getProperty("db.url"));
            System.out.println(prop.getProperty("db.user"));
            System.out.println(prop.getProperty("db.password"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
