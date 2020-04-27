package info.demo;

public class Encapsulation {
	
	//Not recomended to hardcoding instance variables
	// using setters and getters methods to initialize and get the values
	
	int sno;//500
	String sname;
	
	public void setSno(int sno) {
		this.sno=sno;
		
	}
	public void setSname(String sname) {		
		this.sname=sname;
	}
	
	public int getSno() {
		return sno;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void studentInfo() {
		System.out.println(getSno());//500
		System.out.println(getSname());//Smith
	}
	
	
	public static void main(String[] args) {
		Encapsulation a=new Encapsulation();
		a.setSno(500);
		a.setSname("Smith");
		a.studentInfo();
		
		Encapsulation aa=new Encapsulation();
		aa.setSno(600);
		aa.setSname("Smith123");
		aa.studentInfo();
	}
	
}
