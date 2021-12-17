package org.logicalprograms;

public class Iteration_Number_Even_Decrement {

	public static void main(String[] args) {

		int input = 10;

		System.out.println("Iterated using For Loop :");
		for (int i = input; i >= 0; i = i - 2) {
			System.out.print(i + " ");
		}

		System.out.println("\n" + "Iterated using For Loop with Modulus :");
		for (int i = input; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}