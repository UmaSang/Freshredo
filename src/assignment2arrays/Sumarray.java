

//Write a Java program to calculate sum values of an array.​package arrayandstring;
package assignment2arrays;

//import java.util.Scanner;

public class Sumarray {

	public static void main(String[] args) {
	int a[]= {9,7,5,8};
	int sum=0;
	for (int i=0;i<a.length-1;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("Sum of the array elements\n"+sum);
	
	
	}
}

