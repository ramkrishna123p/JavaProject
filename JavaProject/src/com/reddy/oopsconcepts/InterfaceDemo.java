package com.reddy.oopsconcepts;


interface Abc{
	void show();
}
class AbcImpl implements Abc{

	@Override
	public void show() {
		// TODO Auto-generated method stub
	System.out.println("in show");	
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Abc obj=new AbcImpl();  //we can use the reference obj of Abc since AbcImpl is a class
      //which implements Abc we can create an reference and we can create an object of AbcImpl
      obj.show();
	}

}
