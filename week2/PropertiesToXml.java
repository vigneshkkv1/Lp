
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesToXml {
	
	
	    public static void main(String[] args) throws IOException
	    {
	    	Properties props = new Properties();
	    	props.setProperty("email.contact", "contact@gmail.com");	
	    	OutputStream os = new FileOutputStream("D:/ptoxml.xml");
	    	props.storeToXML(os, "Employee","UTF-8");
	    	System.out.println("Done!!Copied ");
	    }
	}