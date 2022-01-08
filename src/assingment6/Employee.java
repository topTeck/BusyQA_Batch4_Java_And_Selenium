package assingment6;

public class Employee {
	
	private int eId;
	private String eName;
	private double eSal;
	private String eJob;
	
	
	public void getEmpData(int id,String name, double sal,String job) {
		eId    = id;
		eName = name;
		eSal  = sal;
		eJob  = job;
	}
	
	//this method should display the emp details
	public void displayEmpData() {
		
		System.out.println("the Name of the emp is " + eName);
		System.out.println("the id of the emp is " + eId);
		System.out.println("the sal of the emp is " + eSal);
		System.out.println("the job of the emp is " + eJob);
		
		
	}

}
