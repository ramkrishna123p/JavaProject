package com.reddy.oopsconcepts;

//Abstract Class And Abstract Method
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MaheshPhone obj=new MaheshPhone();//cannot instantiate abstract class
		obj.call();*/
		MaheshPhone obj=new SureshPhone();
		obj.call();
		obj.move();
		obj.dance();
		obj.cook();

	}

}

abstract class MaheshPhone{  //abstract class  
     public void call(){
    	 System.out.println("calling...");
     }
     //mahesh does not know hoew to provide implementation for move,dance,cook.so he 
     //he is declaring it.when u declare a methos it becomes abstract.when ever methods are abstract
     //class should also be abstract.
     public abstract void move();  //abstract methods
	public abstract void dance();
	public abstract void cook();
	
}
//since ramesh want to implement move he went into libarary and seen that mahesh abstract methods.
//reason for abstract ramesh class is when ever you define abstract methods if all the methods
//implemented then the class will be a normal class since ramesh has implemented only one method move
//then the clas is abstract class.
abstract class RameshPhone extends MaheshPhone{
	 public  void move(){
		System.out.println("Moving....");
	 }
}
class SureshPhone extends RameshPhone{
	public void dance(){
		System.out.println("dancing....");
	}
	public void cook(){
		System.out.println("cooking.....");
	}
}