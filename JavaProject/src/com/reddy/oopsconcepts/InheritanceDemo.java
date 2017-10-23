package com.reddy.oopsconcepts;

/*Let say you got a client and said you about an object that can add two numbers
you have given this code obj to client.but lets say after one year client come back to
you and said i need one object in which i need two features both add and subtract.
here you cannot make changes to class add this class is created by someone else and
that program is not avaliable and we do have the code of this what we have is .class file.
so that means you cannot made changes in this class.create a new class AddSub.we wil have additon
and subtraction what i mean is will have two method sum() and sub().why we wont think that the sum() method comes from 
class so that why  we use extends keyword(inheritance).*/
public class InheritanceDemo {
	public static void main(String[] args){
	AddSub obj=new AddSub(); 
		obj.num1=5;
		obj.num2=4;
		obj.sum();
		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);
	}
}

class Add{
	int num1,num2,result;
	public void sum(){
		result = num1 + num2;
	}
	
}

class AddSub extends Add{               //single level inheritance
	
	public void sub(){
		result=num1-num2;
	}
}

