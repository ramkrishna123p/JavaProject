package com.reddy.oopsconcepts;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Emp e1=new Emp();
       /*e1.empId=5;*/        //i am assigning the value to empId that means any one can access the
//variables with the help of object but your values should be private.All your data members should be private.
       /*e1.empName="Ramakrishna";*/
       e1.setEmpId(4);
       e1.setEmpName("Ramakrishna");
       System.out.println(e1.getEmpId());
       System.out.println(e1.getEmpName());
	}

}
class Emp{
	private int empId;
	private String empName; 
	//private variables can be access with in the  class for that we can use some method to assign values and the get the values
	//using getters and setters
	public int getEmpId(){
		return empId;
	}
	public void setEmpId(int empId){
		this.empId=empId;
	}
	public String getEmpName(){
		return empName;
	}
	public void setEmpName(String empName){
		this.empName=empName;
	}
	
}

