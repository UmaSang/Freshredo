
//This program defines a class `Calculation` with four overloaded `sum` methods:
//
//1. `sum(int x, int y)`: Accepts two integer parameters and returns their sum.
//2. `sum(int x, int y, int z)`: Accepts three integer parameters and returns their sum.
//3. `sum(double x, double y)`: Accepts two double parameters and returns their sum.
//4. `sum(double x, double y, double z)`: Accepts three double parameters and returns their sum.
//
//In the `main` method, an object of the `Calculation` class is created, and each of the methods is called with different inputs. Finally, the results are printed.


//1) Create a class Calculation with the following methods. ​
//Class Name: Calculation​
//int sum(int x, int y) : Should accept two integer parameters and returns sum of two numbers.​
//int sum(int x, int y, int z) : Should accept three integer parameters and returns sum of three
//numbers.​
//double sum(double x, double y) : Should accept two double type parameters and returns sum
//of two numbers.​
//double sum(double x, double y, double z) : Should accept three double type parameters and
//returns sum of three numbers.​
//
//Now, create object for Calculations class ‘cal’ then call different methods by passing different inputs


package assignment3;

public class Calculation2 {
	    
	// Method to calculate sum of two integers
	    public int sum(int x, int y) {
	        return x + y;
	    }
	    
	    // Method to calculate sum of three integers
	    public int sum(int x, int y, int z) {
	        return x + y + z;
	    }
	    
	    // Method to calculate sum of two doubles
	    public double sum(double x, double y) {
	        return x + y;
	    }
	    
	    // Method to calculate sum of three doubles
	    public double sum(double x, double y, double z) {
	        return x + y + z;
	    }

	    public static void main(String[] args) {
	        // Create an object of Calculation class
	        Calculation2 cal = new Calculation2();
	        
	        // Call different methods with different inputs
	        int sum1 = cal.sum(100, 1000);
	        int sum2 = cal.sum(580, 350, 115);
	        double sum3 = cal.sum(22.5, 23.5);
	        double sum4 = cal.sum(21.5, 13.5,64.5);
	        
	        // Print the results
	        System.out.println("Sum of two integers: " +sum1);
	        System.out.println("Sum of three integers: " + sum2);
	        System.out.println("Sum of two doubles: " + sum3);
	        System.out.println("Sum of three doubles: " + sum4);


}
}

