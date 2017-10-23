package com.reddy.javaexamples;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int a[]=new int[5];
            a[0]=9;
            a[1]=4;
            a[2]=1;
            a[3]=6;
            a[4]=13;
            //for loop
            for(int i=0;i<a.length;i++){
            	System.out.println(a[i]);
            }
           /* ArrayDemo ad=new ArrayDemo();
            * 
            ad.display(a);*/
            	for(int p:a){
        			System.out.println(p);
	}
	 //enchance for Loop
	/*public void display(int a[]){
		for(int i:a){
			System.out.println(i);
		}*/
	}

}
