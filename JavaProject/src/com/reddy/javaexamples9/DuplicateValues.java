package com.reddy.javaexamples9;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="testing";
		char chars[]=s.toCharArray();
		/*for(char d:chars){
			System.out.println(d);
		}*/
		Set<Character> c=new LinkedHashSet<>();
		for(Character f:chars){
			System.out.println(c.add(f));
		}
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.append(c).toString());
		//System.out.println(txt);
	}
	

}
