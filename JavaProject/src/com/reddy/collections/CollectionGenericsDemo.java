package com.reddy.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionGenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*The problem is i want to be very specific my collection should be of type integer and should
		not support String and float and it should support only integers for that after the collection
		we can mention something like angular brackets*/
		Collection<Integer> values=new ArrayList<Integer>(); //i do not want to go with object type i want to go
		//with integer type.
		/*Generics means the type of data your mentioning on both sides is called generics.*/
		/*ex:Collection<E> here E maeans type of element your working with*/
		values.add(7);
		values.add(9);
		values.add(33);
		values.add(5);
		/*For example if i want to add an element after 7 it is not possible to add since collection 
		does not have add an element using index so we go for list interface.*/
		for(int i:values){
			System.out.println(i);
		}
	}

}
