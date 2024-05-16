//Write a Java program to find the average score of two students in three papers using 2-dimensional array
package assignment2arrays;

import java.util.Scanner;

//import java.util.Scanner;

public class FindAveTwoDimensional {

	public static void main(String[] args) {
//		
//		int [][] s1 = {{1,2,3},{4,5,6}};
//		int [][] s2= {{3,6,4,},{7,5,9}};
//	    int sum=0;
//		int avg=0;
//		int count=0;
////	
//		for(int i=0;i<s1.length;i++) {
//			for(int j=1;j<s1.length;j++) {
//				System.out.println("Sum of student 1:" +s1[i][j]);
////				
//				for(int i = 0; i < s1.length; i++) {
//				    for(int j = 0; j < s1[i].length; j++) { 
//				        System.out.println(s1[i][j]);
//				    }
//				 for(int i1 = 0; i1 < s2[0].length; i1++) {
//				        for(int j = 0; j < s2.length; j++) {
//				            System.out.println(s2[j][i1]);
//				           
//				        }
//				    }
		
	Scanner sr=new Scanner(System.in);
	System.out.println("Enter the rows:");
	int row=sr.nextInt();
	System.out.println("Enter the columns:");
	int column= sr.nextInt();
	int [][] intArray=new int[row][column];
 	for(int i=0;i<row;i++) 
 	{
 		System.out.println("Enter the students marks:"+(i+1));
 		
 		for (int j=0;j<column;j++)
 		{
 			intArray[i][j]=sr.nextInt();
 }
 	}
		int sum=0;
		int avg=0;
		int count=0;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
			sum=sum+intArray[i][j];
			count++;
			}
		System.out.println("Sum:"+sum);
		avg=sum/(count);
		System.out.println("Average:"+avg);
		sr.close();
		
				        }
			}
				
}
		
		
		
		
		
		
		
		



