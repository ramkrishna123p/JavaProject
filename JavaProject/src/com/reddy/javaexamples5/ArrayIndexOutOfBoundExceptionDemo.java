package com.reddy.javaexamples5;

public class ArrayIndexOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,j,k=0;
		 int a[] = new int[4];
	        i=8;
	        j=2;
	        try{
	        	k=i/j;
	        	for(int c=0;c<=4;c++){
	        		a[c]=c+1;
	        	}
	        	for(int values: a){
	        		System.out.println(values);
	        	}
	        }
	        catch(ArithmeticException e){ //if we know type of exception we can mentionthis type of exception
	        System.out.println("cannot divide by zero");	
	        }
	        catch(ArrayIndexOutOfBoundsException e){
	        	 System.out.println("maximum no of values is 4");	
	        }
	        catch(Exception e){  //if we do not know what type of exception it will throw the use Exception
	        	System.out.println(e);
	        }
	        System.out.println(k);
		}
}