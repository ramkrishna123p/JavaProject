package com.reddy.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<String,String> map = new Hashtable<>();
  	map.put("Ramakrishna", "Reddy"); //as in list add method we have put method in map to add element
	map.put("sakshi", "paper");
	map.put("gopi", "pop");
	map.put("sakshi", "jagan");
	map.put("sakshi", "Reddy");
	System.out.println(map);
	System.out.println(map.get("sakshi"));
	System.out.println(map.get("sakshi1"));
	Set<String> keys = map.keySet();
	
	
	for(String key:keys){
		System.out.println(key+"    "+map.get(key));
	}
	
	}

}
