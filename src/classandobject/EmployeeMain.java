//Creating a Object name "obj1 and obj2" and Initializing the value for the method creating in the Employeeone file. 

package classandobject;

public class EmployeeMain {
	int id;
	String name;
	double salary;
	String jobtitle;

	public static void main(String[] args) {
		
	 Employeeone obj1= new Employeeone();
	 obj1.id= 01;
	 obj1.name= "Indian";
	 obj1.salary= 50.000d;
	 obj1.jobtitle= "QA";
	 obj1.display();
	 
	 Employeeone obj2= new Employeeone();
	 
	 obj2.id= 02;
	 obj2.name= "Mexcian";
	 obj2.salary= 60.000d;
	 obj2.jobtitle= "QA";
	 
	   
	   obj2.display();

	}

}
