package JavaClass1;

public class LearningSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String xyz = "we are learnig Java";
		
		//xyz = "We_are_Learning_Java";
		
		String abc[] = xyz.split(" ");
		
		System.out.println(abc[0]);  //we
		System.out.println(abc[1]);  //we
		System.out.println(abc[2]);  //we
		System.out.println(abc[3]);  //we

		
		//print all the characters
		//split - not be used
		//charat and length and for
		
		System.out.println("==================");
		
		for(int i=0; i<xyz.length(); i++) {
			System.out.println(xyz.charAt(i));
		}
		
		
		
		System.out.println("Printing all the char in reverse");

		for(int j = (xyz.length()-1); j>=0; j-- ) {
			System.out.println(xyz.charAt(j));
		}
		
		

	}

}
