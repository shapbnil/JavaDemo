package info.demo;

public class ReverseString {

	public static void reverseName() {
		
		String s= "biplab";
		for (int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
	}
	
public static void reverseNumber() {
		
		String s="123456";
		for (int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
	}

	public static void reverseString() {
		String s= "Selenium";
		
		int len=s.length();
		String rev="";
		for(int i=len-1; i>=0;i--) {
			rev=rev+s.charAt(i);
			
				}
		System.out.println(rev);
	}
	// Reverse String using String Buffer
	public static void stringBufferDemo() {
		
		String s= "Mahmud";
		StringBuffer sf=new StringBuffer(s);
		System.out.println(sf.reverse());
	}
	
	// Reverse String using String Builder
	
	public static void stringBuilderDemo() {
		String str="Automation";
		StringBuilder str2=new StringBuilder();
		str2.append(str);
		str2=str2.reverse();
		System.out.println(str2);
	}
	
	public static void main(String[] args) {
		reverseName();
		System.out.println();
		 reverseNumber();
		 System.out.println();
		 reverseString();
		 System.out.println();
		 stringBufferDemo();
		 System.out.println();
		 stringBuilderDemo();
		 
	}

}
