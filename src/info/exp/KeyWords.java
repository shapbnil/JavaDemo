package info.exp;

public class KeyWords {

}

//Not possible to extends final classes (inheritence is not possible)
final class D1 {
	//final variable not possible to re-assing/not possible to  change , this are constants
	final int i=10;
	//Final method not possible to override
	public final void m1() {

	}
}

class D3 {
	public void m2() {
		D1 d=new D1();
		d.m1();
//i =100;
		
System.out.println(d.i);
	}
}