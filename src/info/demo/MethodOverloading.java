package info.demo;

public class MethodOverloading {

	// method over loading: Method name same , arguments different in the same class
	// is called
	public void m1() {
		System.out.println("M1 Default");
	}

	public void m1(int a) {
		System.out.println("M1 int a");
	}

	public void m1(int a, int b) {
		System.out.println("M1 int int");
	}

	public void m1(int a, float b) {
		System.out.println("M1 int float");
	}
	
	public static void main(String[] args) {
		MethodOverloading d=new MethodOverloading();
		d.m1();
		d.m1(10,333.888f);
		
		
	}

}
/*
 *Create a class with add numbers method /Multiplication
 *
 *Create a class Organization , and create child class with department
 */
