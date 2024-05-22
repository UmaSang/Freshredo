package assignment3;
//Create a class ‘Calculation’ with 3 integer variables.​
public class Calculation {
	
	private int num1;
    private int num2;
    private int num3;
    
    // Constructor to assign values to variables using this keyword
    public Calculation(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    // Method to calculate sum of three numbers
    public int sum() {
        return num1 + num2 + num3;
    }
    
    public static void main(String[] args) {
        // Create an object of Calculation class by passing three integer values to constructor
        Calculation calc = new Calculation(40, 10, 15);
        
        // Call the sum method to calculate the sum of the numbers
        int result = calc.sum();
        
        System.out.println("Sum of the numbers: " + result);
    }

}
