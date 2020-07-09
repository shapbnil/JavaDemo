package info.demo;

public class NestedForLoop {

	public void loopOne() {
		// nested loops works

				int k=1;
				for (int i=0; i<4; i++) // Outer for loop
				{
					//System.out.println("Outer for loop started");
					
					for(int j=1; j<=4-i; j++) // Inner loop
					{
						System.out.print(k);
						System.out.print("\t");
						k++;
					}
					System.out.println("");
				}
		
	}
	
	public void loopTwo() {
		// nested loops works

				int k=1;
				for (int i=1; i<5; i++) // Outer for loop
				{
					//System.out.println("Outer for loop started");
					
					for(int j=1; j<=i; j++) // Inner loop
					{
						System.out.print(k);
						System.out.print("\t");
						k++;
					}
					System.out.println("");
				}
		
	}
	
	public static void main(String[] args) {
		NestedForLoop nfl=new NestedForLoop();
		nfl.loopOne();
		nfl.loopTwo();

	}

}
