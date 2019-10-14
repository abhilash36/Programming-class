//WAP to reverse the string without using inbuilt function

package strings;

import java.util.Scanner;

public class ReverseString 
{
  public static void main(String[] args) 
  {
	  String rev="";
	  Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=s1.nextLine();
		char[] ch=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
		  rev=rev+ch[i];
		}
		
		System.out.println("Reverse of the string "+s+" is:"+rev);
  }
}
