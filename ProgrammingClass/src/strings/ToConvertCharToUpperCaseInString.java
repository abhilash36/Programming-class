package strings;

import java.util.Scanner;

public class ToConvertCharToUpperCaseInString {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		char[] ch=s1.trim().toCharArray();
		s1 = s1.substring(0, 2).toUpperCase() + s1.substring(2);
		System.out.println("Result is: "+s1);
	}

}
