package assignment3;

public class StudentMain {

	public static void main(String[] args) {
		
		//Methods:​
		//getStuData() Takes student details SID and Sname as parameters and assign them to variables.​
		//getStuMarks() Takes student marks as parameters and assign them to Sub1, Sub2, Sub3.​
		//totalMarks() Calculate total marks and print the student details with total marks. ​
		//
		//Now, create objects from Student class stu1, stu2 etc. Then call Student class methods.​
	
		        // Creating objects of Student class
		        Student stu1 = new Student();
		        Student stu2 = new Student();
		        Student stu3 = new Student();
		        // Setting student details
		        stu1.getStuData(1, "John");
		        stu2.getStuData(2, "Alice");
		        stu3.getStuData(3, "Amal");

		        // Setting student marks
		        stu1.getStuMarks(90, 85, 95);
		        stu2.getStuMarks(75, 80, 85);
		        stu3.getStuMarks(75, 80, 85);

		        // Printing student details with total marks
		        stu1.totalMarks();
		        System.out.println(); // Adding a line break for clarity
		        stu2.totalMarks();
		        System.out.println(); 
		        stu3.totalMarks();
		        
		    }
		}


