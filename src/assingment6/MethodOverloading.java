package assingment6;

public class MethodOverloading {
	
	// a class having 2 mothods with same name 
	
	// 1. the return type should be different - 
	//2. the number of parametres should be dissfers
	
	
	public int sum(int x, int y) {
		return (x+y);
	}
	
	public int sum(int x, int y, int z) {
		return(x+y+z);
	}
	
	public double sum(double x, double y) {
		return(x+y);
	}
}
