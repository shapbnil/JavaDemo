package info.demo;

public class NonStaticDemo {

	int i=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticDemo n=new NonStaticDemo();
		n.i = n.i+10;
		System.out.println( n.i);//110
		
		Demo1 d=new Demo1();
		 d.m1();
	}

}

class Demo1{
	public void m1(){
		NonStaticDemo n1=new NonStaticDemo();
		System.out.println( n1.i);//100
	}
}
