package com.reddy.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Ramakrishna", "Reddy"); //as in list add method we have put method in map to add element
		map.put("sakshi", "paper");
		map.put("gopi", "pop");
		map.put("sakshi", "jagan");
		map.put("sakshi", "Reddy");
		System.out.println(map);
		System.out.println(map.get("sakshi"));
		System.out.println(map.get("sakshi1"));//return null values if the key is not present
		//KeySet will give set of Keys ex:in above example Ramakrishna,sakshi,gopi and store the value in set
		//in the above example they are two key sakshi and the old value is replaced with new value.
		//we can have two values with same name but two keys cannot be same
		Set<String> keys = map.keySet();
		
		for(String key:keys){
			System.out.println(key+"    "+map.get(key));
		}
		
		

	}

}
