package com.reddy.javaexamples5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsDemo {

	public static void main(String[] args) throws Exception{
		/*Throws Keyword will just supress errors but not handle the error*/
		// TODO Auto-generated method stub

		 int i,j=1,k=0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		        i=8;
		       
		        	System.out.println("Enter the number");
		        	 j=Integer.parseInt(br.readLine());
		        	k=i+j;
		        	System.out.println("The output of k is " + k);
		       
			}
	}