package com.joghar.basic.program;

public class Factorial {
	public static void main(String... strings) {
		withOutRecursive(10);
		System.out.println(withRecursive(10));
	}

	public static void withOutRecursive(int number) {
		int i, fact = 1;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

	public static int withRecursive(int number) {
		if (number == 0)
			return 1;
		else
			return (number * withRecursive(number - 1));
	}
}
