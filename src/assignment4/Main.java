//2. Write a program for multiple inheritance by using interface.
//2. Write a program for multiple inheritance by using interface.​
//Interface A : int a, int b add()​
//Interface B : int x, int y mul()​
//Class Calculation : Implements methods from A and B interfaces.
package assignment4;
//Interface D
interface D {
 int add(int a, int b);
}

//Interface C
interface C {
 int mul(int x, int y);
}

//Class Calculation implementing interfaces A and B
class Calculation implements D, C {
 public int add(int a, int b) {
     return a + b;
 }

 public int mul(int x, int y) {
     return x * y;
 }
}

public class Main {
 public static void main(String[] args) {
     // Creating object of class Calculation and calling methods
     Calculation calculationObj = new Calculation();
     System.out.println("Sum of the two numbers: " + calculationObj.add(20, 30));
     System.out.println("Product of the two numbers: " + calculationObj.mul(44, 55));
 }
}
