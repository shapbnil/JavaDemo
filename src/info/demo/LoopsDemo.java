package info.demo;

public class LoopsDemo {

	public void whileLoop() {
		// Print numbers from 1 to 100

		// Cntrl +shift +f

		int i = 1;// Initialization

		while (i <= 100) { // Condition
			System.out.print(i + " ");// stmt
			i++; // icremetn / decrement
		}

		System.out.println();
		int j = 100;// Initialization

		while (j > 0) { // Condition
			System.out.print(j + " ");// stmt
			j--; // icremetn / decrement
		}
	}

	public void doWhileDemo() {

		int i = 0;// Initialization

		do {
			System.out.print(i + " ");
			i = i + 1;// i++   icremetn / decrement 
		} while (i <= 100);// Condition

	}

	public void forLoopDemo() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);// 0 1
		}

		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}

		// HW
		// Print even numbers 1 to 100
		// Print odd numbers 1 to 100
		// print prime numbers 2 3 5 7 11 13
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// While
		// Do while
		// for
		// foreach

		LoopsDemo lp = new LoopsDemo();
		// lp.whileLoop();
		// lp.doWhileDemo();
		lp.forLoopDemo();

	}

}
