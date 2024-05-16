//Write a Java program to convert integer to string.​

package assignment2Strings;

public class ConvertInttoStr {

//	public static void main(String[] args) {
//			int i=200;  
//			String s=String.format("%d",i);  
//			System.out.println(s);  
//			}
	
	
//	public class IntToStringExample1{  
		public static void main(String args[])
		{  
		int i=200;  
		String s=String.valueOf(i);//  Now it will return "200"  
		System.out.println(i+100);//300 because + is binary plus operator  
		System.out.println(s+100);//200100 because + is string concatenation operator  
		}
		}  
	
	


