package classAndObjects;

public class Calculator {
	
	//2 class variables
	//multiple methods
	
	public int x;
	public int y;
	
	// methods - sum, substract, multiply and divide
	
	
	//Method - way to perform the task
	//method contains variable and code
	//method is a place instide the class where we write the code
	
	public void sum() {
		int z;
		z = x+y;
		System.out.println("the addition of the given numbers is " + z);
	}
	
	//sub - substract and retrun the value
	public int sub() {
		int z;
		z = x-y;	
		return z;
	}
	
	private void multiply() {
		int z;
		z = x*y;
		System.out.println("the multiplication of the given mubers is " + z);
	}
	
	protected double divide() {
		int z;
		z = x/y;
		
		return z;
	}
	
	
	
}
