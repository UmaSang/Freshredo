////Write a Java program to calculate average of values of an array.
package assignment2arrays;

public class Averageofvalues2 {

	public static void main(String[] args) {
		int a[]= {10,8,9,4,6};

		float output= Averageofvalues2.getAverage(a);
		System.out.println("Average of an array:" +output);
		}
        
	private static float getAverage(int[] a) {
		int[] input=a;
		int sum=0;
		float length=0;
		float average=0;
		for(int i=0;i<input.length;i++) {
			sum=sum+input[i];
					}
		length=input.length;
		average =sum/length;
		return average;
	}

}
