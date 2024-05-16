//9. Write a Java Program to print factorial of a given number using any loop.

package assisgnment1;
import java.util.Scanner;

public class FindingFractionalnumber {
	
	    public static void main(String[] args) {
	    	Scanner r=new Scanner(System.in);
	    	int n,fact=1;
	    	System.out.println("Enter any number:");
	    	n=r.nextInt();
	    	for(int i=1;i<=n;i++)
	    	{
	    		fact=fact*i;
	    	}
	   System.out.println("Factorial\n" +fact); 
	 r.close();	   
	    }
	}



