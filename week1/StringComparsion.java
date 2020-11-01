import java.util.Scanner;

public class StringComparsion
{ 
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	String str="string";    //String is immutable
	StringBuilder sb=new StringBuilder("stringbuilder"); //StringBuilder is mutable
	StringBuffer str_buffer=new StringBuffer("stringbuffer");//StringBuffer is mutable
	str=str+" Example";
	sb=sb.append(" Example");
	str_buffer=str_buffer.append(" Example");
	System.out.println(str+"\n"+sb+"\n"+str_buffer);
	long startTime=System.currentTimeMillis();

	        for (int i=0; i<10000; i++){  
	            sb.append("Tpoint");  
	        }  
	        startTime=System.currentTimeMillis();
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  //String Builder can run multiple threads.
	        for (int i=0; i<10000; i++){  
	            str_buffer.append("Tpoint");  
	        }
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  //String Buffer cannot run multiple threads.
	        scan.close();
	}

	}