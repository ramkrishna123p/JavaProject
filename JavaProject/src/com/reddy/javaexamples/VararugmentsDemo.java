package com.reddy.javaexamples;

public class VararugmentsDemo {
 public static void main(String args[]){
	 
	 Display obj=new Display();
	 obj.show(5,6,8,9);
	  
 }
}
 class Display{
	 public void show(int ... a){   // here a is an array and ... is vararuguments
		 for(int i : a)
		 System.out.println(i);
	 }
 }

