//3. Write a Java program to find the number of days in a month using switch case statement.
//Get input from user, month from 1-12, using switch case​

package assisgnment1;
import java.util.Scanner;
public class Numberofdaysinamonth {
	
   	
	public static void main(String[] args) {
		String month=null; //garbage value, uninitialized value
		System.out.println("Enter the month number:" );
	Scanner sc=new Scanner(System.in);
	int month_number= sc.nextInt();
	System.out.println("Number entered is: "+ month_number);
	sc.close();	
	
	
		switch (month_number) {
		case 1:
			month= "31 days";
		    break;
		case 3:
			month= "31 days";
		    break;
		case 5:
			month= "31 days";
		    break;
		case 7:
			month= "31 days";
		    break;
		case 9:
			month= "31 days";
		    break;
		case 11:
			month= "31 days";
		    break;
			
		case 4:
			month= "30 days";
		    break;
		case 6:
			month= "30 days";
		    break;
		case 8:
			month= "30 days";
		    break;
		case 10:
			month= "30 days";
		    break;
		case 12:
			month= "30 days";
		    break;
		case 2:
			month= "30 days";
		    break;
		default:
			System.out.println("Invalid input");
		}
		System.out.println(month);
		}
}
		
	
	
	
	
	
	
	
	
	
	

	
	