//Create a class ‘Teacher’ which contains following variables and methods​
//designation = &quot;Teacher&quot;; ​
//collegeName = &quot;BusyQA&quot;;​
//does() -&gt; Teaching​


package assignment4;

public class Teacher {
   String name;
   String designation;
   String CollegeName;


 void does(String name, String designation, String CollegeName) {
	 this.name=name;
	 this.designation=designation;
	 this.CollegeName=CollegeName;
	 System.out.println("Teacher's Name:" +name);
	 System.out.println("Teacher's Designation:" +designation);
     System.out.println("College Name: " + CollegeName);
	 System.out.println("His profession is Teaching");
	   
     }
   
}
	
