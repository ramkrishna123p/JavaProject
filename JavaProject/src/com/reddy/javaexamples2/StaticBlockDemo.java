package com.reddy.javaexamples2;

public class StaticBlockDemo {
	static String s=" ";
	//static should be the first statement in class name and executed before the main method
	static 
	{
		s="Hello World";
		System.out.println("Hi");
	}
	public static void main(String args[]){
	
		System.out.println("The value of s"+  s);
	}

}
