import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortContent {
public static void main(String args[]) throws IOException
{
	FileReader reader=new FileReader("C:\\Users\\VIGNESH\\Downloads\\New folder\\file.txt");
	BufferedReader input=new BufferedReader(reader);
	List<String> list=new ArrayList<>(); 
	String str="";
	while ((str=input.readLine())!=null) {
		list.add(str);		
	}
	Collections.sort(list);
	FileWriter d=new FileWriter("C:\\Users\\VIGNESH\\Downloads\\New folder\\file.txt"); 
	for(String value:list) {
		d.write(value+"\n");
	}
	d.close();
}
}
