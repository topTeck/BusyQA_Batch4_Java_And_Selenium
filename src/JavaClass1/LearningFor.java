package JavaClass1;

public class LearningFor {
	
	public static void main(String[] args) {
		
		//we want to print value from 1 to 50
		//we gona do this with a for loop
		
		
		int z = 50;
		
		//increment loop
		for(int i=1;i<=z;i++) {    
			
			
			//we want to come out of for when i > 20
			
			if(i>20) {
				System.out.println("breaking the loop ");
				break;
			}
			
			System.out.println(i);
		}
		
		//13 - i = 10
		//15 - i = 19
		//16 - i = 20
		
		//13 - i = 20
		//15 - i = 29
		//16 - i = 30
		
		System.out.println("======================");
		
		//print from 50 to 1
		//decrement for loop
		
		for(i=50; i>=1 ; i--) {
			System.out.println(i);
		}
		
		int x=1;
		while(x<=10){
			System.out.println(x);  //1  1
			x++;
		}
		
		
		
	}

}
