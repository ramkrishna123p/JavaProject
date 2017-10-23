package com.reddy.javaexamples7;

enum Mobile1{  //we can define enum outside the class or inside the class.
	APPLE,SAMSUNG,HTC;  
	int price;
	public int getPrice(){
		return price;
	}
}
//at the complier level what your complier does is compiler creates a class called as mobile.when ever u create
//enum mobile the compiler creates a class called class mobilein the backend this APPLE,SAMSUNG,HTC they are 
//static final mobile objects.
//As the class contains method enum also contains methods
/*class Mobile1{
static final Mobile1 APPLE=new Mobile1();
static final Mobile1 SAMSUNG=new Mobile1();
static final Mobile1 HTC=new Mobile1();
}*/

public class WorkingOfEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println(Mobile.APPLE);
		  Mobile1.APPLE.getPrice();//
		 /* Mobile1 m=Mobile1.APPLE;
		  switch(m){
		  case APPLE:
			  System.out.println("apple is best");
			  break;
		  case SAMSUNG:
			  System.out.println("samsung is best");
			  break;
		  case HTC:
			  System.out.println("HTC is best");
			  break;
			  
		  }*/
	}

}
