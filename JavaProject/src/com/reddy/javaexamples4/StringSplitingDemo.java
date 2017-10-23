package com.reddy.javaexamples4;

public class StringSplitingDemo {
	public static void main(String[] args) {
		String str="ram,rajesh,veda,shiva";
		String names[]=str.split(",");
		//System.out.println(names[2]);
		for(String s:names){
			System.out.println(s);
		}
	}
}
