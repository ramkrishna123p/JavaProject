package com.reddy.javaexamples;

public class ClassObjectMethod {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Hello World");
		
		A obj=A.display(5);
		
		
		
	}
	
}	
//  returning and passing object in a method
class A{
		int i;
		private static  A sp;
		public static A display(int i){
		System.out.println("value "+i);
		sp=new A();
		return sp;
	}

}
