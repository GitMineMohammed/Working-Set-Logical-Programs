package org.logicalprograms;

public class Iteration_Number_Reverse {

	public static void main(String[] args) {

		int input = 12345;
		int inputRemainder = 0;
		int output = 0;
		
		while (input > 0) {

			inputRemainder = (input % 10);           // -> Will get "Remainder" of 5 from 12345
			input = (input / 10);               // -> Will get "Quotient" of 1234 from 12345
		    output = (output * 10) + inputRemainder; // -> 5
		} 
		System.out.println(output);

	}
}
