package Utility.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void hashSetDemo() {
		HashSet hs =new HashSet();
		hs.add(100);
		hs.add(100);
		hs.add(null);
		hs.add(null);
		hs.add(500);
		
		System.out.println(hs);
	}
	
	public static void LinkedHashSetDemo() {
		//Follow insertion order
		LinkedHashSet hs =new LinkedHashSet();
		hs.add(100);
		hs.add(100);
		hs.add(null);
		hs.add(null);
		hs.add(500);
		
		System.out.println(hs);
	}
	public static void treeSetDemo() {
		//follow sorting order
		TreeSet hs =new TreeSet();
		hs.add(100);
		hs.add(100);
		hs.add(200);
		hs.add(800);
		hs.add(500);
		
		System.out.println(hs);
	}
	
	public static void main(String[] args) {
		hashSetDemo();
		//LinkedHashSetDemo();
		//treeSetDemo();
	}
}
