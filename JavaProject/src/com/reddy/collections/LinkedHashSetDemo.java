package com.reddy.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //diferrence between HashSet and linkedHashSet is HashSet does not maintain sequence of elements or elements are not 
		//ordered where as LinkedHashSet maintains sequence of elements or elements are order of elements
		//HashSet is not maintaining the insertion order.Linked Hash set maintaining the insertion order.
		/*Set<Integer> values1 = new HashSet<>();
		 values1.add(87);
		 values1.add(97);
		 values1.add(34);
		 values1.add(92);
		 System.out.println(values1);*/
		Set<Integer> values = new LinkedHashSet<Integer>();
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
