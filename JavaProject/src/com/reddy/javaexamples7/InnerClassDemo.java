package com.reddy.javaexamples7;

public class InnerClassDemo {
   public static void main(String[] args) {
	A a=new A();
	A.B obj=a.new B();//A.B means B class belongs to A class
	//you cannot create an instance of B for that i need to create an object of A.Class B is an non-static and we need
	//to create an object of A 
	obj.show();
}
}
class A{
	int rollno;
	String sname;
	
	class B{
		 public void show(){
			 System.out.println("Hello");
		 }
		
	}
}
