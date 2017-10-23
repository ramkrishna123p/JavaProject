package com.reddy.javaexamples9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSample {
	
	public static void main(String[] args) {
     /*Emp1 e2=new Emp1();
    System.out.println(e2.getEmpDetails());*/

}
}
class Emp{
	int age;
	String sname;
	int eid;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}

class Emp1{
	public List<Emp> getEmpDetails(){
		 Emp e1=new Emp();
		 e1.setSname("ramakrishna");
		 e1.setAge(12);
		
		 Emp e2=new Emp();
		 e1.setSname("reddy");
		 e1.setAge(10);
		 List<Emp> emps=Arrays.asList(e1,e2);
		 return emps;
}
}
class Emp2{
	List<Emp>emps;
	public Emp2(){
		emps=new ArrayList<>();
		Emp e1=new Emp();
		 e1.setSname("ramakrishna");
		 e1.setAge(12);
		
		 Emp e2=new Emp();
		 e1.setSname("reddy");
		 e1.setAge(10);
		 emps.add(e1);
		 emps.add(e2);
	}
	public List<Emp> getEmpdetails1(){
		return emps;
	}
	public Emp getEmpdetails2(int id){
		for(Emp e:emps){
			if(e.getEid()==id){
				return e;
			}
				}
		return new Emp();
	}
}