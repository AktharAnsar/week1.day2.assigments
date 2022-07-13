package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		
		char[] ch1= test.toCharArray();
		
		for (int i = 0; i < ch1.length; i++) {
			
			int j = i%2;
			
			if(j!=0) {
				
				ch1[i] = Character.toUpperCase(ch1[i]);
			}
			
			System.out.print(ch1[i]);
			
		}
		
		
	}

}
