package com.reddy.javaexamples4;

import java.util.Scanner;

public class ScannerUserInputDemo {
  public static void main(String args[]){
	  String str="";
	  int i=0;
	  Scanner obj=new Scanner(System.in);
	  /*str=obj.nextLine();*/
	  /*i=Integer.parseInt(obj.nextLine());*/
	  i=obj.nextInt();
	  System.out.println("Hello " + i );
  }
}
