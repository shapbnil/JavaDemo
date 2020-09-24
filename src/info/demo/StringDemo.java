package info.demo;

public class StringDemo {

	public static void main(String[] args) {
		
		//String is pre define class in Java. We can use string as a derived data type. 
		//Two way we can declar String
		// 1. String Literal : String a ="hello";
		//2. By creating an Object class: String a =new String("hello");
		
				String a =new String("hello");
		System.out.println(a);
		String s="  javatraining";
		System.out.println(s);
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("e"));
		System.out.println(s.substring(3,6));
		System.out.println(s.substring(5));
		System.out.println(s.concat(" "+"Biplab"));
		System.out.println(s.trim());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	
		//length of the string 
		System.out.println(s.length());
		
		//Split
		String arr[]=s.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(s.replaceFirst("t", "T"));
	
		
	}

}
