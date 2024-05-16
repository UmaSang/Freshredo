//Write a Java program to get a substring of a given string between two specified positions​
package assignment2Strings;

public class FindSubstring {

	public static void main(String[] args) {
		 String str = "Can you find the Substring";
	        String substring = str.substring(7);
	        System.out.println("Substring from index 7: " + substring);
	        substring = str.substring(1,3); // start a 1 and go until 3 element in the list
	        System.out.println("Substring from index 1 to 3: " + substring);

	}

}
