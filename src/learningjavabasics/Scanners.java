package learningjavabasics;
import java.util.Scanner;
public class Scanners {

	public static void main(String[] args) {
		
		System.out.println("Enter a Float:");
		Scanner scanner = new Scanner(System.in);
		float number = scanner.nextFloat();
		scanner.nextLine(); // Consume the newline character
		System.out.println("Enter a String:");
		String strVariable1 = scanner.next();
		System.out.println("String entered is: " + strVariable1);
		System.out.println(" entered is: " + number);
		scanner.close();
		
	}
}