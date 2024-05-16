//Write a Java program to count number of time a character repeated in a string.​

package assignment2Strings;

public class CountnofStringsrepeated {

	public static void main(String[] args) {
		String s="Lets count the repeated String";
		int totalcount=s.length();
		int repeatedstrcount=s.replace("t","").length();
		int count=totalcount-repeatedstrcount;
		System.out.println(" Number of Occurance:"+count);

	}

}
