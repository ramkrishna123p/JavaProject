package com.reddy.javaexamples;

import java.util.Random;

public class ArrayRandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*when u want random values we use random class*/
		Random r=new Random();
		int a[]=new int[50];
		for(int i=0;i<a.length;i++){
			a[i]=r.nextInt(50);
			System.out.println(a[i]);
		}
		
		for(int i:a){
			System.out.println(i);
			
		}
	}

}
