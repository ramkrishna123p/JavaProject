package com.reddy.oopsconcepts;


public class ObjectCreationaianheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B obj=new B(5);
       
       
	}

}
class A{
	public A(){
		System.out.println("In A const");
	}
	public A(int i){
		System.out.println("In A const Int");
	}
}
	class B extends A{
		public B(){  //when ever u create an object of subclass B we also get the object of A
			//when ever u call a subclass oF B
			super();
			System.out.println("In B const");
		}
		public B(int i){
			System.out.println("In B const Int");
		}
	}

