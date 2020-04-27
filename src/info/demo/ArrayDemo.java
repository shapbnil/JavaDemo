package info.demo;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=100;
		int k=5;
		
		//Array data type any ref name, [] and new datatype with size
		//Array limitations:
			//Size fixed, memory alocation waste, not possibel to increment or decrement after initialization
			//It possible to store only homogenious elements
		
		int l[]=new int[10];
			l[0]=10;
			l[1]=20;
			l[2]=20;
			//l[3]=20;
			l[9]=20;
			
			//l[10]=50;
			
			System.out.println(l[0]);//0
			System.out.println(l[5]);//0
			System.out.println(l[9]);//20
			
			for(int m=0;m<l.length;m++) {
				System.out.println(l[m]);
			}
			String s[]=new String[10];
			s[0]="Today's Deal";
			s[1]="Tomorrow's Deal";
			System.out.println(s[0]="Today's Deal");
			
			
			int iii[] =new int[]{10,40,50,60};
			System.out.println(iii[2]);
		String sss[]=new String[] {"Venkat","Smith"};
		System.out.println(sss[1]);
	}

}
