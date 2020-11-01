import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class CreatePropertyFile  {

    public static void main(String[] args) {

        try (OutputStream output = new FileOutputStream("path/to/config.properties")) {
            Properties prop = new Properties();
            prop.setProperty("db.url", "localhost");
            prop.setProperty("db.user", "vignesh");
            prop.setProperty("db.password", "password");
            prop.store(output, null);
            System.out.println(prop);
        } catch (IOException io) {
            io.printStackTrace();
        }

    }
}
