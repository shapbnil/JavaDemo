package info.exp;

import java.awt.image.ConvolveOp;

public class NumberFormat {

	public void m1() {
		// TODO Auto-generated method stub
		byte b = 12; // 1 bytes //Byte
		short s = 123;// 2 bytes //Short

		int i = 123; // 4 bytes//Integer
		long l = 125;// 8 bytes

		float f = 123.77f;// 4 bytes
		double d = 123.88;// 8 bytes

		boolean ff = true; // 2 bytes
		char c = 'f'; // 1 byte

		String ss = "";

		long ll = i;

		double dd = f;

		byte iii = (byte) l;

		long fff = (int) d;
	}

	public void m2() {
		short s = 23366;//2 bytes
		int i=88888888;//4 bytes
		
		long l=i;
		System.out.println(l);//88888888
		
		short ss=(short)i;
		System.out.println(ss);//88888888
		
	}
	
	public void m3() {
		//How to convert String to another data type(integer)?
		String str="120";
		
		int in=Integer.parseInt(str);
		int ini=Integer.valueOf(str);
		System.out.println(in);
		System.out.println(ini);
		
		String s="1200.999988";
		
		double f=Double.parseDouble(s);
		//Double ff=Double.valueOf(f);
		
		float fl=Float.parseFloat(s);		
		System.out.println(fl);
		//System.out.println(fl1);
		
		//How to convert another data types(integer) to String?
		int i=222;
		String ss=Integer.toString(i);//don't handle null values
		String sss=String.valueOf(i);//It accept null values
		
		System.out.println(ss);
		System.out.println(sss);
	}

	public void m4() {
		// Convert String to Integer
		String s="10";
		String s1="20";
		
		System.out.println(s+s1); //1020
		int i = Integer.parseInt(s);
		int j=Integer.parseInt(s1);
		System.out.println(i+j);//30
	}
	public static void main(String[] args) {
		NumberFormat nm = new NumberFormat();
		//nm.m3();
		nm.m4();
	}

}
