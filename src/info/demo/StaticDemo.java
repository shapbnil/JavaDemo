package info.demo;

public class StaticDemo {

	static {
		System.out.println("Static block1");
	}
	
	
	//Static keyword applicable for methods , variables and block
	//Static method : without creating an object access the method syntax: classname.methodname
	//Static variable: without creating an object access the variable syntax: classname.variablename
	//static block: Static block will execute at the time of class loading
	
	static int i=100;
	public static void m1() {
		System.out.println("method1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		i=i+10;
		System.out.println(i);
		m1();
		
		
		A112.method1();
		
	}

}


class A112{
	
	public static void method1() {
		StaticDemo.m1();
		System.out.println(StaticDemo.i);//110
	}
}
