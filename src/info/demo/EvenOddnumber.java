package info.demo;

public class EvenOddnumber {

	// Print Even Numbers from 0-100
		public void evenNumbers() {
		for (int k=0; k<=100;k++) {
			if (k%2==0) {
				System.out.print(k +" ");
				
			}// 201%2 ===1 200%2 ====0
				
		}
		
		}
	
		// Print odd Numbers from 0-100
		
		public void oddNumbers() {
			for(int i =0 ; i<=100;i++) {
				if(i%2==1) {
					System.out.print(i+" ");
				}
			}
		}
		
	


		public static void main(String[] args) {
			EvenOddnumber eo=new EvenOddnumber();
			eo.evenNumbers();
			System.out.println("");		
			eo.oddNumbers();
			
	}

}
