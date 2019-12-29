package com.joghar.control.statement;

public class Loops {
	public static void main(String... strings) {
		
		// for loop
		int arr[] = { 12, 23, 44, 56, 78 };
		for (int i : arr) {
			System.out.println(i);
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();//
		}
		
		//while loop
		int i=1;  
	    while(i<=10){  
	        System.out.println(i);  
	    i++;  
	    }  
	    
	    // do while
	    do{  
	        System.out.println(i);  
	    i++;  
	    }while(i<=10);  
	}
}