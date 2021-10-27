package org.logicalprograms;

public class Iteration_Given_Number_Reverse_Order {

	public static void main(String[] args) {

		int remainder = 0;
		int input = 12345;
		int output = 0;

		while (input > 0) {

			remainder = (input % 10);           // -> Will get "Remainder" of 5 from 12345
			input = (input / 10);               // -> Will get "Quotient" of 1234 from 12345
		    output = (output * 10) + remainder; // -> 5
		} 
		System.out.println(output);

	}
}
