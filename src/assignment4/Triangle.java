//Create a abstract class Triangle with two types abstract methods

package assignment4;

public abstract class Triangle{
	 public abstract double area();//Abstract method
	 abstract void display ();//Concrete Method/non abstract 
	 }

 class Cal extends Triangle{
	 int base, height;   /// instance variables
		double area;
		double result;
	 Cal(int base, int height) {
	this.base=base;         //Created a constructor  "Cal" 
	this.height=height;
   }
 @Override
 public double area() {
 return result=base*height;
	}
		
	void display() {
	System.out.println("The area of the triangle:"+ result);
		
	}
	
	
}
