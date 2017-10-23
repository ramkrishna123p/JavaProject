package com.reddy.oopsconcepts;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		AddSub2 obj=new AddSub2(); 
		obj.num1=5;
		obj.num2=4;
		obj.sum();
		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);
		obj.multi();
		System.out.println(obj.result);
	}
}

class Add1{
	int num1,num2,result;
	public void sum(){
		result = num1 + num2;
	}
	
}

class AddSub1 extends Add1{ 
	                         //single level inheritance
	public void sub(){
		result=num1-num2;
	}
}
class AddSub2 extends AddSub{
	
	public void multi(){          // multi level inheritance
		result=num1 * num2;
}
}