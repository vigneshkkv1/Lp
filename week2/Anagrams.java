import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int count1[]=new int[128];
		int count2[]=new int[128];
		for(int index=0;index<s1.length();index++)
		{
			count1[s1.charAt(index)]++;
		}
		for(int index=0;index<s2.length();index++)
		{
			count2[s2.charAt(index)]++;
		}
		for(int index=0;index<s1.length();index++)
		{
			if(count1[s1.charAt(index)]!=count2[s1.charAt(index)])
			{ 
				System.out.println("STRINGS ARE NOT AN ANAGRAM");
				return;
			}
		}
		System.out.println("STRINGS ARE ANAGRAM");
	}

}
