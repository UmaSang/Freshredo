//Write a Java program to remove white spaces in a string.​
package assignment2Strings;

public class RemoveSpace {

	public static void main(String[] args) {
		            
		        String str1="Remove white spaces";    
		            
		        //Removes the white spaces using regex    
		        str1 = str1.replaceAll("\\s+", "");    
		            
		        System.out.println("String after removing all the white spaces : " + str1);    
		    }   
	}


