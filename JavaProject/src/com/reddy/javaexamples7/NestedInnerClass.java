package com.reddy.javaexamples7;

import com.reddy.javaexamples7.A.B;

public class NestedInnerClass {

	public static void main(String[] args) {
		C a=new C();
		C.B obj=new C.B();//A.B means B class belongs to A class
		//you cannot create an instance of B for that i need to create an object of A.Class B is an non-static and we need
		//to create an object of A 
		obj.show();
	}
	}
	class C{
		int rollno;
		String sname;
		
		static class B{
			 public void show(){
				 System.out.println("Hello");
			 }
			
		}
	}
