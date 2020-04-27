package info.exp;

public class ArrayTest {
//Arrays are fixed in size, not possible to increse or decrese
	//Memory allocation waste some times
	//It store only homogenious values(int,float)
	
//To over come this Utility package came
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s=new int[5];
		s[0]=10;
		s[1]=20;
		s[2]=30;
		s[3]=50;
		s[4]=40;
		//s[5]=50;
		//System.out.println(s[0]);//10
			System.out.println(s[s.length-2]);
		int m=s.length/2;
		System.out.println(s[m]);//30
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		int []ss={10,20,30,40,50};
		System.out.println(ss[0]);
		
		
		int [][] sss=new int[2][2];
		sss[0][0]=10;
		sss[0][1]=20;
		System.out.println(sss[1][1]);	
		
		int [][] ssss= {{10,20},{50,60}};
		
		for(int i=0;i<ssss.length; i++) {
			for(int j=0;j<ssss[i].length;j++) {
				System.out.println(ssss[i][j]);//10 20 50 60
			}
		}
		
	}

}
