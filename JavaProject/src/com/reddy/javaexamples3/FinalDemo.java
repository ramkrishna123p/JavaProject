package com.reddy.javaexamples3;

//Final Keyword is used with final variable,,final Method,final class.
public class FinalDemo {

	public static void main(String[] args) {
		B2 obj=new B2();
		obj.show();
		// TODO Auto-generated method stub
       /*final int i=5;*/   //final variable.
       //if u make variable as final once it is assigned it will not change
       // if i declare final int i; then i declare i=6 then it will work reason if we failed 
       //assign at declaration,i can assigned later,but once assigned the value is 6.
       //if we chane the value of i = 7 then it will throw error.
       /*System.out.println(i);*/
       
	}

}

/*final*/ class A2{   //i do not want anyone to inherit a class A i can make A class as final
	//if u make a class as final no other class can extend the final class
   final public void show(){   //i want to stop someone i do not want anyone to override
	   //this method so what can i do is to make method as final 
		System.out.println("In A show");
	}
}
class B2 extends A2{
	/*public void show(){
      System.out.println("In B show");*/
	/*}*/
}