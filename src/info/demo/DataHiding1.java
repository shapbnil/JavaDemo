package info.demo;

public class DataHiding1 extends DataHiding{

	public void method() {
		//m1();//private
		m2();
		m3();
		m4();
	}
	public static void main(String[] args) {
		//DataHiding d1=new DataHiding();
		
		DataHiding1 dh=new DataHiding1();
		dh.method();
		
		
		
	}
}
