//Write a Java program to count number of words in a sentence.​

package assignment2Strings;

public class CountnofWords {

	public static void main(String[] args) {
	      String x= "We are Humans";
	     // String y[]=x.split("");
	      String y[] =x.split("\\s+");
	      System.out.println(y.length);

	}

}
