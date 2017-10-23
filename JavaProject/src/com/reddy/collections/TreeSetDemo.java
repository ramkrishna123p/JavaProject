package com.reddy.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> values=new TreeSet<>();//TreeSet will give you the data in ascending order.
		 values.add(87);
		 values.add(97);
		 values.add(34);
		 values.add(92);
		 System.out.println(values);
		 for(int i:values){
			 System.out.println(i);
		 }
		 
		 
	}
}
	


		


