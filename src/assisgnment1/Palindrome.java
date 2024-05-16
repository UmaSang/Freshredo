//8. Write a Java program to check Number is Palindrome or not using while loop.​ (Reverse of 121 is 121,
//so it is palindrome)
package assisgnment1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	sc.close();
	int rev=0;
	int org_num=num;
	while(num!=0)
	{
		rev=rev*10 + num%10;
		num=num/10;
	}
	if(org_num==rev) {
		System.out.println(org_num+ "It is Palindrome number");
			}
	else {
		System.out.println(org_num+ "It is not a Palindrome number");
	}
	}

}
