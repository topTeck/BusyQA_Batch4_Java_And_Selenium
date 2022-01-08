package JavaClass1;

public class LearningIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int x = 100;
		int y = 200;
		
		// i want to proin the greater number
		
		if(x>y) {
			System.out.println("x is greater");
		}else {
			System.out.println("y is greater");
		}
		
		
		//age 
		//0-18 - you are a kid
		//19-65 - you are a adult
		//>65 - you are old
		
		
		int age = 19;
	
		
		if(age<80 ||age >= 0 ) {
			System.out.println("You are a kid");
		}else if(age >18 && age <=65) {
			System.out.println("you are an Adult");
		}else {
			System.out.println("you are an old age person");
		}

	}

}
