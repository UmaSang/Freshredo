package classandobject;

public class CallingClass {

	public static void main(String[] args) {
		
		CallingClass emp1= new CallingClass();
		CallingClass emp2= new CallingClass();
		emp1.intialValue(120, "Mark", 78990);
		emp2.intialValue(130,"John",34343);
		
		emp1.displayValue();
	
	}

		
	}

//StudentClass s1 = new StudentClass();
//s1.intializeValue(111, "Srikant");
//StudentClass s2 = new StudentClass();
//s2.intializeValue(112, "UMA");
//s2.displayValue();
//s1.displayValue();

//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	StudentClass s1 = new StudentClass(111, "Srikant");
//	StudentClass s2 = new StudentClass();
//	s2.id = 112;
//	s2.name = "Rajeshwari";
//	s1.displayValue();
//	s2.displayValue();
//}