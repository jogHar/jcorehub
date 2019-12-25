package com.joghar.operators;

public class shift {

	public static void main(String[] args) {
		System.out.println(4<<2); // 4*2^2=16
		System.out.println(4<<3); // 4*2^3=32
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		
		//For positive number, >> and >>> works same  
	    System.out.println(20>>2);  
	    System.out.println(20>>>2);  
	    //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  
	    System.out.println(-20>>>2);  
	}
}
