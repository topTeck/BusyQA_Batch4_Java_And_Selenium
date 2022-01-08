package JavaClass1;

public class LearningStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "We are learning Java";
		
		System.out.println(str);
		System.out.println(str.charAt(0));  //W
		System.out.println(str.length());
		
		//java
		//contains
		System.out.println(str.contains("Java"));   //true  //false
		System.out.println(str.contains("java"));   //false
		System.out.println(str.contains("We are learning Java ")); //false
		
		
		String x = "Sachin";
		String y = "sachin";
		
		String abc = "30";
		int x1 = 30;

		
		System.out.println(x.equals(y));             // false 
		System.out.println(x.equalsIgnoreCase(y));  //  true
		
		
		System.out.println(str.replace('a', 'A'));
		System.out.println(str.replace("Java", "Coding"));  //
		
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println(x.toLowerCase().equals(y.toLowerCase()));  //true
		
		System.out.println(x.equals(y.equalsIgnoreCase(str)));
		
	}

}
