package com.reddy.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Collection and Generics
//Collection was introduce in 1.2 and Generics was introduce in 1.5
/*why we need collection the answer is collection provide Dynamic array where we can
add elements and expand the size of the array,reduce the size of the array and 
thats the advantage of using collection*/
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int values[]=new int[4];     // in this array we cannot increase or decrease the size of the array 
//		// so we go for collection
//		Object values1[]=new Object[4];
//		values1[0]="Reddy";
//		values[1]=7;
		//Collection means collection of objects
		Collection values=new ArrayList(); 
		
		// ArrayList is a class and implements List interface and List interface extends 
		//Collection interface.
		values.add("Ramakrishna"); // values is object
		values.add(5);
		values.add(5.8);
		/*we can fetch the values in collection using two methods 1.iterator 2.enhanced for loop*/
		/*Iterator i=values.iterator();*///iterator returns the iterator object
		
		/*while(i.hasNext()){  //hasnext will fetch the next values.
			System.out.println(i.next());
		}*/

		for(Object p:values){
			System.out.println(p);
		}
	}

}
