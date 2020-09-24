package info.demo;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student1 s = new Student1();
		// s.studentDetails(100, "Johnson");

		Student1 ss = new Student1(200, "Smith");
		// ss.studentDetails(100, "Johnson");
		ss.studentMarks();
		
		
		Student1 sss = new Student1(400, "Peter");
		sss.studentMarks();
	}

}

class Student1 {
// Constructor: Constructors will execute at the time of creating an object. 
	//You can pass some information at the time creating an object and use that information in any where in that class
	// Constructor name and Class name must and should same otherwise compile time error 
	int sno;
	String sname;

	Student1() {
		System.out.println("Default constructor");
	}

	Student1(int a, String b) {
		System.out.println("Parametarizes constructor");
		System.out.println(a);
		System.out.println(b);

		this.sno = a;
		this.sname = b;
	}

	void studentDetails(int sno, String sname) {
		System.out.println(sno);
		System.out.println(sname);
	}

	public void studentMarks() {
		System.out.println(sno);
		System.out.println(sname);
	}
}
