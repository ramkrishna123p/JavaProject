package com.reddy.javaexamples;

import java.util.Random;

public class ArrayIndexOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int a[]=new int[50];
		for(int i=0;i<a.length;i++){
			a[i]=r.nextInt(50);
			//System.out.println(a[i]);
		}
		try{
			System.out.println(a[52]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Maximum index is 49");
		}
		
		for(int i:a){
			System.out.println(i);
			
		}
	
	}

}
