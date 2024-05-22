//Creating class named "Employeeone" and void method in same java file. 
//Initalizing the object in other main class and executing the value.  
package classandobject;

public class Employeeone {
	int id;
	String name;
	double salary;
	String jobtitle;

//Method--
	void display() 
	{
	System.out.println(id);
	System.out.println(name);
	System.out.println(salary);
	System.out.println(jobtitle);
	
	}
	//Method--
	void bonus() {
		System.out.println((salary * 10)/100);
	}
}
