//Write a java program to compare two strings, ignoring case differences.​

package assignment2Strings;

public class CompareStrings {

	public static void main(String[] args) {
		 String str1 = "All THE Best";
	        String str2 = "ALLthe BEST";
		 boolean isequalsIgnoreCase = str1.equalsIgnoreCase(str2);
	        System.out.println("Strings comparision with equalsIgnoreCase: " + isequalsIgnoreCase);		

	}

}
