
//Write a Java program to concatenate a given string to the end of another string.
package assignment2Strings;

public class ConceStrings {

	public static void main(String[] args) {
		String str = "Life is";
		int lengthOfString = str.length();
		System.out.println("Length of the String is: "+lengthOfString );

		String str2 = " short";
		String concatenatedString = str.concat(str2);
		System.out.println("Concat final string is: "+ concatenatedString);
		

	}

}
