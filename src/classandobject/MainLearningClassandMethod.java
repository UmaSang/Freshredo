package classandobject;

public class MainLearningClassandMethod {

	public static void main(String[] args) {
		
		LearningClassandMethod emp1= new LearningClassandMethod();
		emp1.id =15;
		emp1.name= " Mark";
		emp1.Salary= 67000d;
		emp1.displayValue();
		System.out.println();
		
		LearningClassandMethod emp2= new LearningClassandMethod();
   	   emp2.intialvalue(14, "Samee", 56000d);
	   emp2.displayValue();
		System.out.println();

		

		LearningClassandMethod emp3= new LearningClassandMethod();
		emp3.id =13;
		emp3.name= " Adam";
		emp3.Salary= 97000d;
		emp3.displayValue();
		

	}

}
