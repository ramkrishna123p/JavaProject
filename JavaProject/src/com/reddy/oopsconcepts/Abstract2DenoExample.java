package com.reddy.oopsconcepts;

public class Abstract2DenoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone obj=new Iphone();
		SamsungS4 obj1=new SamsungS4();
        show(obj1);
	}
	/*The problem is why we need these two methods,both the method name is show and both the methods
	are taking paramaters as object of phone why to create this two methods,what if we can create one method
*/	
	public static void show(Phone obj){
	obj.showConfig();	
	}
	/*public static void show(SamsungS4 obj){
		obj.showConfig();	
		}*/
	
	//but the problem is if we create one method what should be the parameter it should
	//be iphone or s4  tahts the confussion right.to slove this problem we come across abstract class.
}
abstract class Phone{
	 public abstract void showConfig();
}

class Iphone extends Phone{
	public void showConfig(){
		System.out.println("2GB,IOS 9.3 version");
	}
}
class SamsungS4 extends Phone{
	public void showConfig(){
		System.out.println("2GB,Lolipop ");
	}
}