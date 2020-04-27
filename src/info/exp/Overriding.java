package info.exp;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Parent
		A1 a1 = new A1();
		a1.m1();// A1 M1
		a1.m2();// A1 M2

		// No override methods in A2
		// Child
		A2 a2 = new A2();
		a2.m1();// A1 M1
		a2.m2();// A1 M2
		a2.m3();//A2 M3

		// Child
		A2 a3 = new A2();
		a3.m1();// A2 M1
		a3.m2();// A1 M2
		a3.m3();//A2 M3
		
		A1 a=new A2();
		a.m1();//A2 M1
		a.m2();//A1 M1
		//a.m3();//Compile time error , in A1 class m3 method is not there
	}

}
