package info.exp;

public class ConstructorDemo extends Constructor1{

	ConstructorDemo(int b,int c){
		super(c,b);
		System.out.println(b);//20
		System.out.println(c);	//30	
	}
	public static void main(String[] args) {
		
		//Constructor1 c=new Constructor1(10);
		ConstructorDemo demo=new ConstructorDemo(20,50);
	}
}


