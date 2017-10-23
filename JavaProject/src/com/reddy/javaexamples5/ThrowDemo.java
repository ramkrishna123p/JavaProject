package com.reddy.javaexamples5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int i,j=1,k=0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		        i=8;
		       
		        try{
		        	System.out.println("Enter the number");
		        	 j=Integer.parseInt(br.readLine());
		        	k=i+j;
		        	if(k<10){
		        		throw new ArithmeticException();
		        	}
		        	System.out.println("The output of k is " + k);
		       
		        }
		        catch(IOException e){  // checked Exception
		        	System.out.println("Some IO error");
		        }
		        catch(ArithmeticException e){ //if we know type of exception we can mentionthis type of exception
		        System.out.println("minimum value of the output is 10 "  +  e);	
		        }
		        catch(ArrayIndexOutOfBoundsException e){
		        	 System.out.println("maximum no of values is 4");	
		        }
		        catch(Exception e){  //if we do not know what type of exception it will throw the use Exception
		        	System.out.println(e);
		        }
		        finally{
		        	System.out.println("BYE");
		        }
			}
	}