package strings;

import java.util.Scanner;

public class NumOfOccurancesOfGivenCharInString 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=s1.nextLine();
		char[] ch=s.trim().toCharArray(); 
		
		System.out.println("Enter the character to be search in the string");
		char se=s1.next().charAt(0);
		
		boolean found=false;
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==se)
			{
				found=true;
				count++;
			}
		}

		if(count>0)
			System.out.println(se+" character is found & its occurance is: "+count);
		else
			System.out.println(se+" character is not found");
	}

}
