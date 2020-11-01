import java.util.Scanner;

public class Duplicate_Characters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
        char[] s1=scanner.next().toCharArray();
        for(int index=0;index<s1.length;index++)
        {
        	for(int index1=index+1;index1<s1.length&&s1[index]!='0';index1++)
        	{
        		if(s1[index]==s1[index1])
        		{ 
        			s1[index1]='0';
        		}
        	}
        } 
        for(int index=0;index<s1.length;index++)
        {
        	if(s1[index]!='0')
        	System.out.println(s1[index]);
        }
        
	}

}
