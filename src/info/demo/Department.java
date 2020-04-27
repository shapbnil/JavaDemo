package info.demo;

public class Department extends Organization {

	String det = "Patient";
	
	public void gro() {
		System.out.println(det);
	}
	
	public static void main(String[] args) {
		
		Department d=new Department();
		System.out.println();
		d.gro();
		d.name();
				
		
	}
	
}
