package com.reddy.javaexamples4;

public class ThisKeywordDemo {
public static void main(String args[]){
	A obj=new A(6);
	obj.show();
}
}
class A{
	private int x;  //x is called instance varibale
	public A(int x){  //a is called local variable change a to x and when u run the code the output is  
		//zero.even if u assign value 6 the local varibale value is zero.because this value 6 is assigned to local variable 
		//itself we are not able to assign this to a instance variable and to do that we need to mention that this
		//x is not a local variable and this x is instance variable in order to use this instance we have use this.x=x;
		this.x=x; //current instance
	}
	public void show(){
		System.out.println("x is " + x);
	}
}
