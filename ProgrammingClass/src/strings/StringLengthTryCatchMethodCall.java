package strings;

import java.util.Scanner;

public class StringLengthTryCatchMethodCall 
{
 public static int stringLength(String s1)
 {
	 char[] ch=s1.toCharArray();
	 int count=0;
	 
	 try
	 {
		 for(int i=0;true;i++)
		 {
			 if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z' || ch[i]==' '||
		     !(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z' || ch[i]==' '))
			 {
			   // char c=ch[i];
			      count++;
			 }
		 }
	 }
	 
	 catch(Exception e)
	 {
		// System.out.println("Exception caught");
	 }
	 return count;
 }
	
  public static void main(String[] args) 
  {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String s1=s.nextLine();
	int res=stringLength(s1);
	System.out.println("Length of the given string is: "+res);
  }
}
