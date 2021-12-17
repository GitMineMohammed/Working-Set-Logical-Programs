package org.logicalprograms;

public class Iteration_Number_Product {

public static void main(String[] args) {

		int inputRemainder = 0; 
		int input = 12345;
		int output = 1; 

		while (input > 0) {
			
			inputRemainder = (input % 10);                    // -> Will get "Remainder" of 5 from 12345
			input = (input / 10);                             // -> Will get "Quotient" of 1234 from 12345
		    output = (output*inputRemainder); 
		} 
		System.out.println("Product of Output :"+ output);
	} }