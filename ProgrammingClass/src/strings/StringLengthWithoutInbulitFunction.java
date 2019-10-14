package strings;

import java.util.Scanner;

public class StringLengthWithoutInbulitFunction 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	     System.out.println("Enter the String");
	     String s1=s.nextLine();
	     
	     char[] ch=s1.toCharArray();
	     
	     int count=0;
	     
	     for(int i=0;i<ch.length;i++)
	     {
	    	 
	    		 if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z' || ch[i]==' '||
	    		 !(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z' || ch[i]==' '))
	    		 {
	    			 count++;
	    		 }
	    	 
	     }
         System.out.println("Length of the given string is: "+count);
        }
	 }
