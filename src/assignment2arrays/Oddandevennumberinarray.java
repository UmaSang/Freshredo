//Write a Java program to print even and odd numbers in an array.​

package assignment2arrays;

//import java.util.Scanner;

public class Oddandevennumberinarray {
	
	public static void main(String[] args) {
		int a[]= {8,5,3,6,1,0};
		//int input=0;
		//Scanner sc=new Scanner(System.in);
		//int input=sc.nextInt();
		//System.out.println("Enter the number:"+ input);
		//sc.close();
		
		for (int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
				System.out.println("Odd number\n");
			}
		}
		for (int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
				System.out.println("Even number\n");
				
			}
		}
		

	}

}
