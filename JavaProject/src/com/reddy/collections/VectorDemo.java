package com.reddy.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		/*Vector is same as Arraylist.Vector is a dynamic array in which you can increase the size
		of the array,vector increases the size by 100%*/
		/*when to use vectors and when to use arraylist?
		vector - if u exceed the limit it will increase the capacity by 100% and wastes lot of memory,thread safe(sychrozined)
		vector is slow
		arraylist - it will increase the capacity be 50% and saves lot of memeory and not thread safe and it is very fast*/
		Vector<Integer> v = new Vector<Integer>();//vector increase the capacity by 100%
		v.add(2);
		v.add(6);
		v.add(7);
		v.add(9);
		v.add(5);
		v.add(211);
		v.add(16);
		v.add(21);
		v.add(23);
		v.add(25);
		v.add(26);
		v.add(28);
		System.out.println(v.capacity());
		for(int i:v){
			System.out.println(i);
			
		}
	}

}
