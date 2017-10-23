package com.reddy.javaexamples3;

public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          B obj=new B(5);
	}
}
class A{                                //super class 
	public A(){
		/*super();*/ // super call default constructor of Object i.e  class A extends Object class 
		System.out.println("In A constant");
	}
	public A(int i){
		 
		System.out.println("In A constant Para");
	}
}
class B extends A{                       // sub class
	public B(){
		/*super(); */  //Super will call the parent class constructor or super class constructor
		System.out.println("In B constant");
	}
	public B(int i){
		super(i);
		System.out.println("In B constant Para");
	}
}