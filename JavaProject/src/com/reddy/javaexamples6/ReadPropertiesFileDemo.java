package com.reddy.javaexamples6;


import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFileDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Properties p = new Properties();
		InputStream fis=new FileInputStream("dataconfig.properties");
		p.load(fis);//load method loads properties file i.e all the data from dataconfig.properties file of fileinputstrea
		//into properties p object.
		System.out.println(p.getProperty("url"));//getproperty is used get value of the key
		p.list(System.out); //list is used to list the properties.
	}

}
