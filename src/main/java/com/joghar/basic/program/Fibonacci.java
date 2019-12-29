package com.joghar.basic.program;

public class Fibonacci {

	public static void main(String[] args) {
		// Fibonacci Series in Java without using recursion
		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		
		// Fibonacci Series using recursion in java
		System.out.println();
		System.out.print(np1+" "+np2);//printing 0 and 1    
		printFibonacci(count-2);//n-2 because 2 numbers are already printed   
	}
	
	
	static int np1=0,np2=1,np3=0;  
	static void printFibonacci(int count){    
	    if(count>0){    
	         np3 = np1 + np2;    
	         np1 = np2;    
	         np2 = np3;    
	         System.out.print(" "+np3);   
	         printFibonacci(count-1);    
	     }    
	 } 

}
