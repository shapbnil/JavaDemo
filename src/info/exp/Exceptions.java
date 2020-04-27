package info.exp;

public class Exceptions {

	public void m1() {
		
		//throw : to raise new excetpions using throw keyword
		
		int i=10/5;//2
		
		if(i<0) {
			
			throw new ArithmeticException("Number is not valid");
		}
		
		
		System.out.println(10/5);//2
		//Runtime Exceptions
		
		//File related operations, DB operations, thread related
		//Thread.sleep(3000);
		try {
			Thread.sleep(3000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void m2() throws Exception{
		Thread.sleep(3000);
	}
}
