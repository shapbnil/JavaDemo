package info.demo;

public class DataHiding {
	
	//Default possible to access within the pacakge, not possible access outside package 
	
	//Protected: is poosible to access within the package and outside the package also 
	
	private int i=100;
	private void m1() {
		System.out.println("m1"+i);
	}
	
	public void m2() {
		System.out.println("m2");
	}
	
	void m3() {
		System.out.println("m2");
	}
	
	protected void  m4() {
		
	}

}
