package classAndObjects;

public class CallingCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// i  want tp call the methods of calculator class
		//i need to create an object of the calculator class
		
		Calculator calc = new Calculator();
		
		
		calc.x = 100;
		calc.y = 50;
		
		calc.sum();  // execute the sum and print the value  //150
		
		System.out.println(calc.sub());  //int  50
		//System.out.println("The bubstarction of given numbers is " + x);
		
		
		// sum - 30 * (x*by)
		
		
		Calculator c2 = new Calculator();
		c2.x = 200;
		c2.y = 500;
		
		c2.sum();
		c2.multiply();
		
		
		System.out.println(calc.x); //100
	}

}
