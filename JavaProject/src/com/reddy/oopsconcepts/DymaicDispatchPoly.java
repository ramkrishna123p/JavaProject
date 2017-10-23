package com.reddy.oopsconcepts;

//Dynamic Method Dispatch Run Time Polymorphism
public class DymaicDispatchPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        F obj1=new F();
        G obj2=new G();
	    F f;
	    f=obj1;
	    f.show();
	}
	}
class F{ 
		public void show(){
			System.out.println("In show F");
		}
}
 class G extends F{
		public void show(){
			System.out.println("In show G");
		}
	}
	
