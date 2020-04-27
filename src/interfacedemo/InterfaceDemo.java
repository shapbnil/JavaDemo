package interfacedemo;

public interface InterfaceDemo {

	//i is final variable
	 int i=10;
	//Interface contains only abstract methods, no non abstract methods
	 // Interface has no body
	public abstract void m1() ;
	public  void m2() ;
		
}

class A1 implements InterfaceDemo{
	
	public void m1() {
		//i=100;
		System.out.println("m1"+i);//10
	}
	public void m2() {
		System.out.println("m2");
	}
		
}
 
//Abstract class contains non abstract methods and abstract methods
//not possible to create object for abstract classes

abstract class A2 implements InterfaceDemo{
	public void m1() {
		System.out.println("m1");
	}
	public void m3() {
		System.out.println("m3");
	}
	
	public abstract void m4();
}
//Difference between interface and abstract classes
//interface contains only abstract methods
//Abstract class contains abstract and non abstract methods
//not possible to create object for abstract and interfaces
//interface can implements
//abstract can extends

class A3 extends A2{
	public void m2() {
		System.out.println("m2");
	}
	public void m4() {
		
	}
}




