package strings;

import java.util.Scanner;

public class CountOfAlphaNumSpaceSpecialChar {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	     System.out.println("Enter the String");
	     String s1=s.nextLine();
	     
	     char[] ch=s1.toCharArray();
	     
	     int acount=0;
	     int ncount=0;
	     int scount=0;
	     int spcount=0;
	     
	     for(int i=0;i<ch.length;i++)
	     {
	    	 if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z')
	    	 {
	    		 acount++;
	    	 }
	    	 else if(ch[i]>='0' && ch[i]<='9')
	    	 {
	    		 ncount++;
	    	 }
	    	 else if(ch[i]==' ')
	    	 {
	    		 scount++;
	    	 }
	    	 else
	    	 {
	    		 spcount++;
	    	 }
	     }
	     
	     System.out.println("Number of characters present in the given string is: "+acount);
	     System.out.println("Number of numbers present in the given string is: "+ncount);
	     System.out.println("Number of spaces present in the given string is: "+scount);
	     System.out.println("Number of special characters present in the given string is: "+spcount);

	}

}
