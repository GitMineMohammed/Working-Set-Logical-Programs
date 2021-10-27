package org.logicalprograms;

public class Swapping_Given_Numbers {

	public static void main(String[] args) {

		// Swapping With help of "Third Variable"

		int a = 10;
		int b = 20;

		int c = a;
		a = b;
		b = c;
		System.out.println("Swapping of Input a is " + a + " Swapping of Input b is " + b);
	}
}

// -----------------------------------------------------------------------------------------------------------------

// Swapping Without help of "Third Variable"
// int a=10; int b= 20;

// a=a+b;
// b=a-b;
// a=a-b;

// System.out.println("Swapping of Input a is "+a +" Swapping of Input b is
// "+b); }