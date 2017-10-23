package com.reddy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList class Implements List Interface and list interface extends collection intgerface.
		//Disadvantages of collection is we cannot add values in between,does not work with indexes and we cannot
		//sort the elements also.
       /*collection interface does not work with index numbers so we go with list interface.*/
		/*Arraylist is used searching and linkedlist is used frequent inseration and deletion.
       List<Integer> values=new ArrayList<Integer>();
        values.add(7);
		values.add(9);
		values.add(33);
		values.add(5);
		values.add(22);
		values.add(3, 99);
		Collections.sort(values);
		for(int i:values){
			System.out.println(i);
		}
		/*Iterator<Integer> i = values.iterator();
		while(i.hasNext()){
			System.out.println(i.next());*/
		}
	}


