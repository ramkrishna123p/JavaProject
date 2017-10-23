package com.reddy.javaexamples7;

 enum Mobile{  //we can define enum outside the class or inside the class.
	APPLE,SAMSUNG,HTC;  
 }



public class EnumDemo {
	/*enum Mobile{  //we can define enum outside the class or inside the class.
		APPLE,SAMSUNG,HTC;  
	 }*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(Mobile.APPLE);
      
     
      //if i want to know list of enum constants use values 
      Mobile m[]=Mobile.values();
      for(Mobile c:m){
    	  System.out.println(c);
    	  //System.out.println(c.name());
      }
	}

}
