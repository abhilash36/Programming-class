package strings;

import java.util.Scanner;

public class ReverseOnlyCharNotWordWithoutInbuiltFunction 
{
		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the string");
			String s1=s.nextLine();
			String rev=" ";
			
			char[] ch=s1.trim().toCharArray();
			
			for(int i=0;i<ch.length;i++)
			{
				int start=i;
				
				while(i<ch.length && ch[i]!=' ')
				{
					i++;
				}
				int end=i-1;
			
			
			    while(end>=start)
			    {
				  rev=rev+ch[end];
				  end--;
			    }
			    rev=rev+" ";
		    }
		System.out.println("Reverse of the string is: "+rev);
	}
}