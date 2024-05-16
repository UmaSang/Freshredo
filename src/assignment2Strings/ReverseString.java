//Write a Java program to reverse a string.​
package assignment2Strings;

public class ReverseString {

	public static void main(String[] args) {				
				char ch;
			String str="All is Well", newstr="";
			System.out.print("Original word: ");
			System.out.println("All is Well"); //Example word
			
			for (int i=0; i<str.length(); i++)
			{
				ch= str.charAt(i); //extracts each character
				newstr= ch+newstr; //adds each character in front of the existing string
			}
			System.out.println("Reversed word: "+ newstr);
			}

	}



