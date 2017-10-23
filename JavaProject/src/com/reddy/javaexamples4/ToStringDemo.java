package com.reddy.javaexamples4;

public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student obj=new Student(11,"Ramakrishna");
        //System.out.println(obj.rollno);
        //System.out.println(obj.sname);
        System.out.println(obj.toString());
        
	}

}
class Student{    //in java every class will extend object class
	//hashcode means when ever u create an object in java it will go into a virtual box
	//subset type of memory and u can say it as box and that box will have a value.
	//in that box we can have multiple objects and each box will have a unique value or code called hashcode.
	//In java when u try to print the object toString method is called if your class
	//does not have toString method it will jump to object class toString
	int rollno;
	String sname;
	Student(int rollno,String sname){
		this.rollno=rollno;
		this.sname=sname;
	}
	public String toString(){
	 return "Student(" + "rollno=" + rollno + ", sname="+ sname + ')';
	}
}