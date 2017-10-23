package com.reddy.javaexamples;

public class TwoDimentionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=5,b=6,c=7,d=8;
       int x[]={5,6,7,8};
       int y[]={6,7,8,9};
       int z[]={9,8,7,6};
       
       /*int p[][]=new int[3][4]; // 3 rows(5,6,9) and 4(5,6,7,8)s columns
       p[0][0]=5;
       p[0][1]=6;
       p[0][2]=7;
       p[0][3]=8;
       p[1][0]=6;
       p[1][1]=7;*/
       /*this is array for arrays*/
       int p[][]={
    		   {5,6,7,8},
    		   {6,7,8,9},
    		   {9,8,7,6}
              };
       /*this is for loop*/
       for(int i=0;i<3;i++)
       {
    	   for(int j=0;j<4;j++){
    		   System.out.print(p[i][j]+" ");
    	   }
    	   System.out.println("");
       }
       
       /*This is enchance for loop*/
       for(int i[]:p){
    	   for(int j:i){
    		   System.out.print(j+" ");
    	   }
    	   System.out.println("");
       }
	}

}
