//Write a program to check a string is palindrome or not​ (e.g., reverse of &quot;level&quot; is &quot;level&quot;)
package assignment2Strings;
import java.util.*;   
public class PalindromeStr {
		   /**
		 * @param args
		 */
		public static void main(String args[])  
		   {  
		      String original, reverse = ""; // Objects of String class  
		      Scanner in = new Scanner(System.in);   
		      System.out.println("Enter a string/number to check if it is a palindrome");  
		      original = in.nextLine();   
		      int length = original.length();   
		      for ( int i = length - 1; i >= 0; i-- )  
		         reverse = reverse + original.charAt(i);  
		      if (original.equals(reverse))  
		         System.out.println("Entered string/number is a palindrome.");  
		      else  
		         System.out.println("Entered string/number isn't a palindrome.");   
		      in.close();   }
		}  
	

