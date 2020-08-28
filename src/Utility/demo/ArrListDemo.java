package Utility.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	//To store group of individual values
	public static void arrayListDemo() {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20.888f);
		al.add(30);
		al.add(true);
		al.add("Venkat");
		al.add(null);
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.get(2));
		
		ArrayList<Integer> ala=new ArrayList<Integer>();
		ala.add(10);
		ala.add(100);
		
		/*
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		*/
		
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public static void linkedListDemo() {
		
		//Diff between Array\list and \linked list
		//insert value at middle easy in linked list when compare to Array \list
		//Linked list mechanisam follow in LL
		LinkedList al=new LinkedList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(null);
		al.add(null);
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.get(2));
	}
	
	public static void vectorDemo() {
		//Vector is legacy class : this available from 1.0v but array list from 1.2
		//Synchronized: only one thread can access (only one user access at a time)
		Vector v=new Vector();
		v.add(100);
		v.add(10);
		v.add(null);
		v.add("Venkat");
		System.out.println(v.size());
		System.out.println(v);
		System.out.println(v.get(2));
	}
	
	public static void stackDemo() {
		//Last come first serve mechanisam
		Stack v=new Stack();
		v.add(100);
		v.add(10);
		v.add(null);
		v.add("smith");
		System.out.println(v.size());
		System.out.println(v);
		System.out.println(v.get(2));
	}
	
	public static void main(String[] args) {
		arrayListDemo();
		
		/*
		 * linkedListDemo(); vectorDemo(); stackDemo();
		 */
	}
}
