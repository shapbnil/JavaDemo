package info.demo;

public class Welcome  extends Student{

	int i=10;
	
	public void m1() {
		//Student s=new Student();
		studentInfo();
		studentInfo1();
		System.out.println(i);
		
		System.out.println(i);
		System.out.println(i);
		if(5>3) {
			return;
		}
		
		System.out.println(i);
	}
	public static void m2() {
		
		
		//System.out.println(i);
	}
	
	public int m3() {
		System.out.println(i);
		i=20;
		return i;
	}
	
	
	public static void  main(String[] args) { //
		
		
		Welcome w=new Welcome();
		w.m1();
		m2();
		
		int j=w.m3();
		System.out.println(j);
		//return j;
		
		/*
		 * Student s=new Student(); s.studentInfo();
		 */
		
		w.studentInfo();
		
	}
}
