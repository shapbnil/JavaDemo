package info.demo;

public class Student extends College{//Multiple inheritence not possible

	int sno=200;
	String sname ="Smith";
	
	
	public void studentInfo() {
		System.out.println(sno);
		System.out.println(sname);
	}
	
	public void studentInfo1() {
		System.out.println(sno);
		System.out.println(sname);
	}
	
}
