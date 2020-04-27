package info.demo;

public class MethodOverriding {
//Method over loading: method name is same, arguments same in different classes,but parent and child relationship is required
//use: Parent class implementation not sufficient then only we can override
	//This is called Runtime polymorphisam / dynamic polymarphisam
	
	public static void main(String[] args) {
		A1 a1=new A1();
		a1.m1();
		
		B1 b1=new B1();
		b1.m1();
		
		A1 a=new B1();
		a.m1();
		a.m2();
	}

}

class A1{
	public void m1() {
		System.out.println("A1 M1");
	}
	public void m2() {
		System.out.println("A1 M2");
	}
}

class B1 extends A1{
	public void m1() {
		System.out.println("B1 M1");
	}
	public void m2() {
		System.out.println("B1 M2");
	}
	public void m3() {
		
	}
}