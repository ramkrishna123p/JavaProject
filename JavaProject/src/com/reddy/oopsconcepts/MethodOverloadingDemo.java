package com.reddy.oopsconcepts;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             C obj=new C();
             obj.show(5.5);
	}

}
/*method overloding is also called as early binding,static binding,compile time polymaorphism*/
class C{    //method overloading means same method name and different parameters but data type may be different 
	public void show(){
		System.out.println("Hello");
	}
	public void show(int i){
		System.out.println("Hello :"+i);
	}
	public void show(double i){
		System.out.println("Hello :"+i);
	}
}
