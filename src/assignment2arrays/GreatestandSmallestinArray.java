//Write a program to find greatest and smallest element in an array.​
package assignment2arrays;

public class GreatestandSmallestinArray {

	public static void main(String[] args) {
		
		int a[]= {-1,-3, 0,89,45,78,12,200};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Smallest:\n" +min+ "\nLargest\n" +max);
	}
		
}


