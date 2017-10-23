package com.reddy.javaexamples6;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandlingDemo {

	public static void main(String[] args) throws  Exception {
		File f =new File("Demo.txt");
		FileOutputStream fos=new FileOutputStream(f);//we need to create an object of DataoutputStream
		//we require object of FileOutPutStream
	  DataOutputStream dos=new DataOutputStream(fos);	//To Store the data into txt file we use dataoutputstream and writeUTF belongs to the class DataOutPutStream
       dos.writeUTF("Demo content"); //To write data we use WriteUTF method and the UTF is the format that will save the data in this format and to use writeUTF we need
       //create an object of dataOutputstream
      
       FileInputStream fis=new FileInputStream(f);
       DataInputStream dis=new DataInputStream(fis);//
       String txt=dis.readUTF(); //readUTF is used  to read the data from txt file and in order to use readUTF we need to create an object of DataInputStream.
  System.out.println(txt);     
	}

}
