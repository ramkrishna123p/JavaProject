package com.reddy.javaexamples6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;



public class InputStreamReaderDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f =new File("Demo.txt");
		InputStream is = new FileInputStream(f);
		BufferedReader bfr = new BufferedReader(new InputStreamReader(is));
		String str=bfr.readLine();
		System.out.println(str);
	
			
			
			
		}
	}


