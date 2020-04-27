package info.demo;

public class Add {
	public  int add(int a, int b) {
		int c = a+b;
		//System.out.println(c);
		return c;
		
	}
	public  float add(float f,float f1) {
		float f2 = f+f1;
		//System.out.println(f2);
		return f2;		
	}
	
	public static void main(String[] args) {
		Add a=new Add();
		int aa=a.add(10, 40);
		System.out.println(aa);
		float fff=a.add(10.988f, 340.888f);
		System.out.println(fff);
		
	}


	
}
