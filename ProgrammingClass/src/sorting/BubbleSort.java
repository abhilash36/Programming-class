package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=s.nextInt();
		
		System.out.println("Enter the array elements");
		int[] a=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}

	//	int temp=a[0];
		
		for(int i=0;i<a.length-1;i++)
		{
		   for(int j=0;j<a.length-i-1;j++)
			{
			  if(a[j]>a[j+1])
			  {
			   int temp=a[j];
			   a[j]=a[j+1];
			   a[j+1]=temp;
			  }
			}
		}
		
		System.out.println("After swapping, array elements are:");
		for(int i=0;i<a.length;i++)
		{
		   System.out.println(a[i]);
		}
	}

}
