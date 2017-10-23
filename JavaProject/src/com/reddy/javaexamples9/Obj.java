package com.reddy.javaexamples9;


interface MyInterface{
	void frob();
}

public class Obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface myObj=new Obj1();
		myObj.frob();
		((Obj1)myObj).frob();
	}

}

class Obj1 implements MyInterface{

	@Override
	public void frob() {
		System.out.println("do somethong");
		
	}
	
	
}
