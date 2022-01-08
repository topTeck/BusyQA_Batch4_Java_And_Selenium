package assingment6;

public class CallingEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		
		emp1.getEmpData(1, "Sachin", 5000, "QA");
		emp1.displayEmpData();
		
		
		emp2.getEmpData(2, "Usha", 5000, "QA");
		emp2.displayEmpData();
		
		

	}

}
