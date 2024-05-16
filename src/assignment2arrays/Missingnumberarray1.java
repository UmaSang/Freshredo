
//Write a Java program to find missing number in an array.​ (Remove one number from the given array)
package assignment2arrays;

public class Missingnumberarray1 {

	public static void main(String[] args) {
//		int[] a= {6,3,4,7};
//		int sum=0;
//		for(int x:a)
//			sum+=x;
//		
//		int start=a[0];
//		for(int i=0;i<a.length-1;i++) {
//			start=(start<a[i+1])?start:a[i+1];
//		}
//		int actual_sum=(a.length+1)*(start+start+a.length)/2;
//		System.out.println(actual_sum-sum);
		
		//ex: 1+2+4+5=>12=>sum1
		//    1+2+3+4+5=>15=>sum2
		//sum2-sum1=missing number
 int arr[]= { 10,12,13,14,15};
 
 int sum1=0;
 
 for (int i=0;i<arr.length;i++) {
	 sum1=sum1+arr[i];
 }
 System.out.println("Sum of elements in array:"+sum1);

 int sum2=0;
 for(int i=0;i<=15;i++)
 {
	 sum2=sum2+ i;
 }
 
 System.out.println("Sum of range of elements in array:"+sum2);
 System.out.println("Missing number:"+(sum2-sum1));

	}

}
