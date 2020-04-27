package Utility.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	//To store values in key value pair
	//Key can't be duplicate, value can be duplicate
	
	
	public static void HashMapDemo() {
		HashMap<String , String> hm=new HashMap<String, String>();
		hm.put("sno", "100");
		hm.put("sname", "Smith");
		hm.put("marks", "99");
		hm.put("percent", "99");
		hm.put("sno", "100");
		System.out.println(hm);
		System.out.println(hm.get("sno"));
		System.out.println(hm.size());
		
		for (Map.Entry<String, String> keyValues : hm.entrySet()) {
			System.out.println(keyValues.getKey());
			System.out.println(keyValues.getValue());
		}
		
		Set entrySet= hm.entrySet();
		Iterator i= entrySet.iterator();
		while(i.hasNext()) {
			Map.Entry entry= (Map.Entry)i.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	
	//To store values in key value pair
		//Key can't be duplicate, value can be duplicate
	//it's follow insertion order
	public static void LinkedHashMapDemo() {
		LinkedHashMap<String , String> hm=new LinkedHashMap<String, String>();
		hm.put("sno", "100");
		hm.put("sname", "Smith");
		hm.put("marks", "99");
		hm.put("percent", "99");
		hm.put("sno", "100");
		System.out.println(hm);
		System.out.println(hm.get("sno"));
		System.out.println(hm.size());
		
	}
	//To store values in key value pair
		//Key can't be duplicate, value can be duplicate
	//it's follow assending order based on keys
	public static void TreeMapDemo() {
		TreeMap<String , String> hm=new TreeMap<String, String>();
		hm.put("sno", "100");
		hm.put("sname", "Smith");
		hm.put("marks", "99");
		hm.put("percent", "99");
		hm.put("sno", "100");
		System.out.println(hm);
		System.out.println(hm.get("sno"));
		System.out.println(hm.size());
		
	}
	
	public static void main(String[] args) {
		HashMapDemo();
		//LinkedHashMapDemo();
		//TreeMapDemo();
	}

}
