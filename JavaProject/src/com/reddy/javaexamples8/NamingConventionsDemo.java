package com.reddy.javaexamples8;

/*for Interface and class name specifically  the first letter should be capital letter.
for variable,method name,package name the first character should be small lette(all letters should be small letters
for Constants everthing should be capital letters.*/	

/*ex:MyFirstJavaClass - In Java when you define any name which has more than one word ex:MyFistJavaClass has four words
when ever you combine these four words and all small and you cannot figure it out which word is changing
that why java follows camel casing rule which means  whenever you combine two words,the second letter first word 
should be capital letter*/
/*variable - ex:abc
constant - ex:ABC
Constructor - Abc()
Method  - abc()
Interface - Abc
Class Name - Abc*/

interface Test{   // Interface first letter should be capital letter and remaining letters should be small letters
void add();	      // Interface names are adjective.
}

public class NamingConventionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
class Stock{         //Class names are nouns and first letter should be captial letter and remaining letters should be small letters
	String sname;    // varibale names should be small letters
	String stockprice;
	//constants should be PI,DENSITY all should be captial letters.
	public void show(){ //method name should be small letters one more example actionPerformed.method defines Verb
		System.out.println("Hello");
	}
}
