//Conditions, Loops and Input from user
//1. Write a Java program to get a number from the user and print whether it is positive or negative​

package assisgnment1;
import java.util.Scanner;
public class Conditions {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		num= sc.nextInt();
		if (num>=0) {
		System.out.println("Positive");
		} else { 
			if(num<=0){
		System.out.println("Negative");
		sc.close();
		} 
			
		}
		}
	}

		

	

