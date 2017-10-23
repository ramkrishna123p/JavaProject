package com.reddy.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values=new LinkedList<Integer>();
		values.add(5);
		values.add(12);
		values.add(6);
		values.add(9);
		values.add(1, 7);
		/*Iterator<Integer> i = values.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}*/
		System.out.println(values);
		System.out.println(values.get(2));
		
	}

}
