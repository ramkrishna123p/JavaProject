package com.reddy.javaexamples1;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Abc.i=5;*/
       Abc.show();
	}

}
class Abc
{
	static int i=5;
	public static void show() {
	
		System.out.println("Hi");
		System.out.println(i);
	}
}
