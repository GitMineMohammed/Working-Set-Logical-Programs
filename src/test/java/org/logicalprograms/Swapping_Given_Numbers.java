package org.logicalprograms;

public class Swapping_Given_Numbers {

	public static void main(String[] args) {

		System.out.print("Swapping With help of \"Third Variable\" :" + "\n"
				+ "========================================" + "\n");
		int a = 10;
		int b = 20;
		int c = a;

		a = b;
		b = c;
		System.out.println("Swapping of Input a from b is " + a + "\n" + "Swapping of Input b from c is " + b + "\n");

		// -----------------------------------------------------------------------------------------------------------------

		System.out.print("\n" + "Swapping Without help of \"Third Variable\" :" + "\n"
				+ "===========================================" + "\n");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Swapping of Input a from b is " + a + "\n" + "Swapping of Input b from c is " + b + "\n");
	}
}