//WAP to find the frequency of occurrance of each character in a string

package strings;

import java.util.Scanner;

public class OccuranceCountOfEachLetter {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String S1=s.nextLine();
		char[] ch=S1.toCharArray(); 
		
		for(int i=0;i<ch.length;i++)
		{	
			boolean duplicate=false;
			
             //to check if the selected character is already present and it is counted			
		   	  for(int j=i-1;j>=0;j--)
		//    for(int j=0;j<=i-1;j++)
			{	
				if(ch[j]==ch[i])
				{
				  duplicate=true;
				  break;
				}
			}
			
			
			if(!duplicate) 
			{
			  int count=1;
				
			  for(int j=i+1;j<ch.length;j++)
			  {
				if(ch[j]==ch[i])
				
					count++;
			   }
			System.out.println(ch[i]+" has occurred "+count+" no. of times and i have selected " +i+" th occurrace");
			}
			
		}
		
		
	}
}
