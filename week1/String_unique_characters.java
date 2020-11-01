import java.util.Scanner;
public class String_unique_characters {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in); 
	 int count[]= new int[128];
	 String string=sc.next();
	 for(int i=0;i<string.length();i++)
	 {
		 count[string.charAt(i)]++;
	 }
	 for(int i=0;i<string.length();i++)
	 {
		 if(count[string.charAt(i)]>1)
		 {
			 System.out.println("THE CHARACTERS ARE NOT UNIQUE");
			 return;
		 }
	 }
	 System.out.println("THE CHARACTERS ARE UNIQUE");
	 
	 
	 
	}

}
