package com.reddy.javaexamples;

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ghi obj=new Ghi();
	}
	
}
class Ghi{
	public void Ghi(){   // Constructor Overloading
		System.out.println("I am in Ghi");
	}
	public void Ghi(int i){
	System.out.println("I am in Ghi Contant");
}
}
