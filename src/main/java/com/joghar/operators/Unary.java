package com.joghar.operators;

public class Unary {
	public static void main(String...strings) {
		int x = 4;
		System.out.println(x++); //4 --> 5
		System.out.println(++x); //6
		System.out.println(x--); // 6 --> 5
		System.out.println(--x); // 4
		
		boolean isTrue = true;
		System.out.println(!isTrue); // false
		
		System.out.println(~x); // -5 (minus of total positive value which starts from 0)
	}
}
