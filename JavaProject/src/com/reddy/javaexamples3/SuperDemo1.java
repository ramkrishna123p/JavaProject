package com.reddy.javaexamples3;

public class SuperDemo1 {
public static void main(String args[]){
B1 obj=new B1();
obj.abc();
}
}
/*class A1{
	int i=5;
	
}
class B1 extends A1{
	int i=4;
	public void show(){
		System.out.println(super.i);*/
class A1{
	public void abc(){
	System.out.println("A abc");
	}
}
class B1 extends A1{
		public void abc(){
		super.abc();
		System.out.println("B abc");
		}
}
