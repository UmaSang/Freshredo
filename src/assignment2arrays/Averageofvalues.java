//Write a Java program to calculate average of values of an array.​

package assignment2arrays;

import java.util.Scanner;

public class Averageofvalues {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]= new int[5]; int sum=0; double avg;
		System.out.println("Enter array elements");
		for(int i=0; i<5; i++) 
		{
         a[i]= sc.nextInt();
		}
		System.out.println("Array elements");
		for (int i=0;i<5;i++)
		{
			System.out.println(a[i]+ " ");
		}
		for(int i=0;i<5; i++)
		{
			sum=a[i]+sum;
					}
         avg=sum/5.0;
         System.out.println("\n Addition"+sum+ "\n Average"+avg);
         sc.close();
	}

}
