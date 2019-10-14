package strings;

import java.util.Scanner;

public class VtMethodNumOfOccurancesOfGivenCharInString 
{
  public static int occuranceCount(String s,char se)
  {
	  char[] ch=s.trim().toCharArray(); 
	  
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==se)
			{
				count++;
			}
		}
      return count;
  }
  
	public static void main(String[] args) 
	{
		int count=0;
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=s1.nextLine();
		
		System.out.println("Enter the character to be search in the string");
		char se=s1.next().charAt(0);
		
		int res=occuranceCount(s,se);
		
		if(count==0)
			System.out.println(se+" character is found & its occurance is: "+res);
		else
			System.out.println(se+" character is not found");
		
	}

}
