package com.reddy.javaexamples6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class WritePropertiesFileDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Properties p=new Properties();  //properties is akey value pair and properties extends hash table
		OutputStream ot=new FileOutputStream("dataconfig.properties"); // we need to create a file and store data
		//into that file.create an object of OutPutStream so that we can store data outside.
		//OutputStream is abstract class so we cannot create an object  of OutputStream
		//so we use FileOutPutStream.
		p.setProperty("url","localhost:8080\\mydb");
		p.setProperty("Username", "Ramakrishna");
		p.setProperty("Password", "shiva");
		p.store(ot, null);  //Store method is used to push the data into the config.properties file.
		 
		
	}

}
