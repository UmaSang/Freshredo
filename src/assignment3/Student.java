
//Classes and Objects (Part 1)
//1. Create a Student class contains the following variables and methods.​
//Class Name: Student​
//Variables: SID, Sname, Sub1, Sub2, Sub3​
//Methods:​
//getStuData() Takes student details SID and Sname as parameters and assign them to variables.​
//getStuMarks() Takes student marks as parameters and assign them to Sub1, Sub2, Sub3.​
//totalMarks() Calculate total marks and print the student details with total marks. ​
//
//Now, create objects from Student class stu1, stu2 etc. Then call Student class methods.​
//



package assignment3;

public class Student {
	int SID;
	String Sname;
	int Sub1,Sub2,Sub3;
    // Method to get student details////getStuData() Takes student details SID and Sname as parameters and assign them to variables.
    void getStuData(int sid, String sname) {
        SID = sid;
        Sname = sname;
    }

    // Method to get student marks////getStuMarks() Takes student marks as parameters and assign them to Sub1, Sub2, Sub3.
    void getStuMarks(int sub1, int sub2, int sub3) {
        Sub1 = sub1;
        Sub2 = sub2;
        Sub3 = sub3;
    }

    // Method to calculate total marks and print student details
    void totalMarks() {
        int total = Sub1 + Sub2 + Sub3;
        System.out.println("Student ID: " + SID);
        System.out.println("Student Name: " + Sname);
        System.out.println("Total Marks: " + total);
    }
}
