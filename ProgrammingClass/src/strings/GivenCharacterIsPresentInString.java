package strings;

import java.util.Scanner;

public class GivenCharacterIsPresentInString 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=s1.nextLine();
		int count=0;
		
		
		char[] ch=s.trim().toCharArray();
		
		System.out.println("Enter the character to be search in the string");
		char se=s1.next().charAt(0); //to read accept the String & in that we are going to take first character dynamically
		
		
		boolean found=false;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==se)
			{
				found=true;
				count++;
			}
		  }
		
		
		if(found)
			System.out.println("Given character "+se+"  is present & its occurrances are: "+count);
		else
	        System.out.println("Given character "+se+" is not present");
	}

}
