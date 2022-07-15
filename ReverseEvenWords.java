package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
	
		String text = "I am a software tester";
		
		String[] splitText = text.split(" ");
		String revStr ="";
		
		for (int i = 0; i < splitText.length; i++) {
			
			int k = i%2;
			
			if(k==0) {
				
				
				char[] ch1 = splitText[i].toCharArray();
				
				for (int j =  ch1.length-1; j>=0; j--) {
					
					
					 System.out.print(ch1[j]);
					
				}
				
				
				
			}else {
				
				System.out.print(" "+splitText[i]+" ");
			}
			
			
		}
		

	}

}
