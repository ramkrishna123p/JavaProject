package com.reddy.javaexamples7;


enum Mobile2{  //we can define enum outside the class or inside the class.
	APPLE(100),SAMSUNG,HTC(90);  
	int price;
	 
	
	Mobile2(){  //we can create a constructor of enum and set price.
		price=80;
		System.out.println("enum constructor");
	}
	
	Mobile2(int p){
		price=p;
	}
	public int getPrice(){
		return price;
	}
}

/*class Mobile1{
static final Mobile1 APPLE=new Mobile1(100);
static final Mobile1 SAMSUNG=new Mobile1();
static final Mobile1 HTC=new Mobile1(90);
}*/

public class EnumDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(Mobile2.APPLE.getPrice());
	}

}
