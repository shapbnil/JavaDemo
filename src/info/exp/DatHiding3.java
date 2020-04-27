package info.exp;

import info.demo.DataHiding;

public class DatHiding3 extends DataHiding{

	public void method() {
		//m1();//private
		m2(); //public 
		//m3();//default
		m4();//protected
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatHiding3 d=new DatHiding3();
		d.method();
		
	}

}
