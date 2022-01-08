package JavaClass1;

public class LearningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stubxyz[
		
		//declare a integer array of length 10
		
		int xyz[] = new int[10];
		
		//inser tthe valye in the array
		xyz[0] = 10;
		
		xyz[1] = 160;
		xyz[2] = 15320;
		xyz[3] = 103532;
		xyz[4] = 10;
		xyz[5] = 105;
		xyz[6] = 1046;
		xyz[7] = 106;
		xyz[8] = 1643;
		xyz[9] = 436;

		
		
		//print the value
		//System.out.println(xyz[3]);   //103532
		
		//System.out.println(xyz[0]);   //10
		
		//we goona print the value of the array through a loop
		
		for(int i=0; i<xyz.length;i++) {
			System.out.println(xyz[i]);
		}
		
		
		//declare a array of lenght 5 for string
		String countryName[] = new String[5];
		
		countryName[0] = "India";
		countryName[1] = "Canada";
		countryName[2] = "USA";
		countryName[3] = "New Ziland";
		countryName[4] = "Singapur";
		
		
		
		//itrate through the array and come out of loop when country == USA
		
		for(int a = 0; a<countryName.length ; a++) {
			
			if(countryName[a] == "USA") {
				break;
			}
			
			System.out.println("Country name is " + countryName[a]);
		}
		

	}

}
