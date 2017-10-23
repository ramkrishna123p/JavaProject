package com.reddy.javaexamples8;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=15;
		/*while loop first executes the condtion and then statements
		do while loop first executes the  statements and then loop*/
		do
		{
			System.out.println(i);
			i++; //i=i+1 post increment ++i pre increment
			
		}while(i<10);
	}

}
