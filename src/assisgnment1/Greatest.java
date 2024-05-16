//2. Write a Java program to find greatest of 3 numbers.​
package assisgnment1;

import java.util.Scanner;

public class Greatest {

public static void main(String[] args) {
	
		int num1, num2, num3;
		Scanner sc= new Scanner(System.in);		
		System.out.println("Enter the num1:");
		num1 = sc.nextInt();
		System.out.println("Enter the num2:");
		num2 = sc.nextInt();
		System.out.println("Enter the num3:");
		num3 = sc.nextInt();
		sc.close();
		
		if(num1>num2 && num1>num3){
			System.out.println(num1+ "is greatest");
		} 
		else if(num2>num3 && num2>num1)
		{ 
			System.out.println(num2+ "is greatest");
		}else {
			System.out.println(num3+ "is greatest");
		
		}
		}
}
		
	


