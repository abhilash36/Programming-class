package strings;

import java.util.Scanner;

public class CountSpecialCharacters 
{
	public static void main(String[] args) 
	{
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the String");
     String s1=s.nextLine();
     
     char[] ch=s1.toCharArray();
     
     int scount=0;
     for(int i=0;i<ch.length;i++)
     {
        if(!(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z'||ch[i]>='0' && ch[i]<='9'))
    	  {
    		 scount++;
    	  }
     }
  System.out.println("Count of special characters present in the given string is: "+scount);
	}

}
