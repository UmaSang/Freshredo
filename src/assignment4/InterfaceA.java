//1. Write a program to demonstrate interface.​
//Interface A : int a, int b sum()​
//Class B : Implements method from A and calculate sum of a and b​
//
package assignment4;

//Interface A
interface A {
 int sum(int a, int b);
}

//Class B implementing interface A
class B implements A {
 public int sum(int a, int b) {
     return a + b;
 }
}

public class InterfaceA {
 public static void main(String[] args) {
     // Creating object of class B and calling method
     B Obj = new B();
     System.out.println("Sum: " + Obj.sum(55, 30));
 }
}
