package strings;

import java.util.Scanner;

public class Password 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		char[] ch=s1.toCharArray();  
	     
	    int scount=0;
	    
	    if(ch.length>=8) 
	    {
	     for(int i=0;i<=ch.length;i++)
	     {
	    	 if(ch[i]>='A' || ch[i]<='Z' && ch[i]>='a' || ch[i]<='z' && ch[i]==' ')
	    
	    		 System.out.println("Valid password");
	    	 else
	    		 System.out.println("Invalid password");	    	 
	     }
	  }
	}
}
