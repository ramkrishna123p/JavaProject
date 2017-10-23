package com.reddy.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
	 Set<Integer> values = new HashSet<>();
	/* values.add(5);
	 values.add(6);
	 values.add(9);
	 values.add(6);*/
	 values.add(87);
	 values.add(97);
	 values.add(34);
	 values.add(92);
	/* what is the difference between list and set?
    suppose if i add value 6 after element 9
    In List allows duplicate elements where as set does not allow duplicates Elements
    set supports unique elements
    List follows the sequence of elements but set does not follow the sequences of elements*/
	 for(int i:values){
		 System.out.println(i);
	 }
	 
	}

	

}
