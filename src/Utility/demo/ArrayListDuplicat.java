package Utility.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListDuplicat {

	public static void main(String[] args) {
		ArrayList<Integer> nlist=new ArrayList<>();
		nlist.add(10);
		nlist.add(20);
		nlist.add(10);
		nlist.add(20);
		nlist.add(30);
		
		Set<Integer> s=new HashSet<>();
		for(Integer x:nlist) {
			if(s.add(x)==false)
				System.out.println(x);
		}
	}

}
