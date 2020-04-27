package info.exp;

public class ExceptionsDemo {

	public void m1() {
		System.out.println("line 1");

		try {
			//String s=null;
			//s.concat("ABCD");
			System.out.println(10 / 0);
			System.out.println("try");
		} catch (ArithmeticException aaa) {
			// TODO: handle exception
			System.out.println("Catch");
			System.out.println(aaa.getMessage());
		} catch (NullPointerException aaa) {
			// TODO: handle exception
			System.out.println("NullPointer");
			System.out.println(aaa.getMessage());
		}
		
		catch (Exception aaa) {
			// TODO: handle exception
			System.out.println("Exception");
			System.out.println(aaa.getMessage());
		}
		
		finally {
			System.out.println("finally");
			//Close DB
		}

		System.out.println("line 2");
	}

	public static void main(String[] args) {

		ExceptionsDemo eeee = new ExceptionsDemo();
		eeee.m1();
	}

}
/*
Connect Db

Connect SQL
Get the connection
Write query
Execute stmt
Closet the DB
*/

/*
 * Exception //Parent
	ArthemeticException  //Child
	NullFormatExcepti  //Child
	ArrayOutofbound    //Child
 * 
 * */
 