package com.joghar.basic.program;

public class Palindrome {
	public static void main(String...strings) {
		checkPelindrome(454);
	}
	
	public static void checkPelindrome(int number) {
		int r,sum=0,temp;    
		  
		  temp=number;    
		  while(number>0){    
		   r=number%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   number=number/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(temp +" is palindrome number ");    
		  else    
		   System.out.println(temp +" is not palindrome");    
	}
}
