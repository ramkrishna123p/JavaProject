package com.reddy.javaexamples8;

public class IfElseDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		a     b     &&
	  True   True   True
	  True   False  False
	  False  True   False
	  False  False  False
	  
		a     b     ||
	  True   True   True
	  True   False  True
	  False  True   True
	  False  False  False*/
		  
		
       int a,b,c;
       a=4;
       b=13;
       c=8;
       if(a>b && a>c){
    	   System.out.println("A");
       }else if(b>c){
    	   System.out.println("B");
    	   
       }else{
    	   System.out.println("C");
       }
	}

}
