package com.reddy.javaexamples5;

public class RuntimeExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        int i,j,k=0;
        i=8;
        j=0;
        try{
        	k=i/j;
        }
        catch(ArithmeticException e){
        System.out.println("cannot divide by zero");	
        }
        System.out.println(k);
	}

}
