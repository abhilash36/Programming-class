package strings;

import java.util.Scanner;

public class FindCharInStringUsingMethod 
{
  public static boolean FindChar(String s,char se)
  {
		char[] ch=s.trim().toCharArray();  
        boolean found=false;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==se)
			{
				return true;
			}
		  }
		return false;
  }
  
  public static void main(String[] args) 
  {
	    Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=s1.nextLine();
		
		System.out.println("Enter the character to be search in the string");
		char se=s1.next().charAt(0);
		boolean res=FindChar(s,se);
	
	//	System.out.println("Is searched character is present?"+res);
		
		if(res==true)
		 System.out.println("searched character is present");
		else
			System.out.println("searched character is not present");
  }
}
