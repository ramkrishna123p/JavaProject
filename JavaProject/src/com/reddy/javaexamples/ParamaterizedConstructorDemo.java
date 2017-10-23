package com.reddy.javaexamples;

public class ParamaterizedConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Def obj=new Def(5);//when ever you create an object it automatically call the  constructor
		
	}

}
/*Constructor name is same name as class name,constructor does not return any value,when
you instaintate an object constructor gets callled.
*/
class Def{
	public Def(int i){                           
		System.out.println("I Abc Constant");
	}
}
