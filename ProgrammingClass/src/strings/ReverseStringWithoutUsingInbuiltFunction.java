//WAP to display the given string in reverse order.

package strings;

import java.util.Scanner;

public class ReverseStringWithoutUsingInbuiltFunction 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=s1.nextLine();
		char[] ch=s.toCharArray();
		
		System.out.println("Reverse of the string is: ");
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
}
