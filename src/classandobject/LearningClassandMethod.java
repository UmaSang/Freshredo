package classandobject;

public class LearningClassandMethod {
	int id;
	String name;
	 double Salary;

    void intialvalue(int i,String name, double Salary) {
	id =i;
	name= " Mark";
	Salary= 67000d;
}
    
    void displayValue() {
    	System.out.println("Printing the ID:" +id);	
	    System.out.println("Printing the name:" +name);
	    System.out.println("Printing the name:" +Salary);
    }
    
    
}

//int id;
//String name;
//
//void intializeValue(int i, String SName) {
//	id = i;
//	name = SName;
//}
//
//void displayValue() {
//	System.out.println("Printing the name "+name);
//}

//public class StudentClass {
//	int id;
//	String name;
//	
//	StudentClass(int i, String SName) {
//		id = i;
//		name = SName;
//	}
//	
//	StudentClass(){}
//	
//	void displayValue() {
//		System.out.println("Printing the name "+name);
//	}
//}