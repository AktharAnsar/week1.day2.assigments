package week1.day2;



public class Palindrome {

	public static void main(String[] args) {
		
		String str1 = "madam";
		String revStr = "";
		
		char[] ch1 = str1.toCharArray();

		for (int i = ch1.length-1; i>=0 ; i--) {
			
			revStr = revStr + ch1[i];
			}
		
		if(str1.equals(revStr)) {
			
			System.out.println(str1+ " string is palindrome");
		}else {
			
			System.out.println(str1+ " string is not palindrome");
		}
	}
	
	
	
}
