package info.exp;

public class Overloading {

	public void add() {
		System.out.println("add");
	}

	public void add(int a, int b) {
		System.out.println("Add int int ");
	}

	public void add(long a, int b) {
		System.out.println("long int");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o = new Overloading();
		o.add(10, 30);
	}

}
