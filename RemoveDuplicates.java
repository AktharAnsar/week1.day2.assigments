package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		 int count = 0;
		 
		 String[] split1 = text.split(" ");
		 
		 for (int i = 0; i < split1.length; i++) {
			 
			 
			 for (int j = 0; j < split1.length; j++) {
				
				 if(split1[i].equals(split1[j])) {
					 
					 count++;
				 }
				 
				 if(count>1) {
					 
					split1[j] = "";
					 count =1;
				 }
				 
				
				 
			}
			 
			
			 count =0;
			 System.out.print(split1[i]+" ");
		}
		 
		
	}

}
