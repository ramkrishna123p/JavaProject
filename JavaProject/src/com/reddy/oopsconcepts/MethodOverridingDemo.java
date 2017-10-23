package com.reddy.oopsconcepts;

public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      D	obj=new D();
      obj.show();
	}

}
class D{ //method Overriding is called as late binding,Dynamic binding,runtime Polymorphism
	public void show(){
		System.out.println("In show D");
	}
class E extends A{
	public void show(){
		System.out.println("In show E");
	}
}
}
