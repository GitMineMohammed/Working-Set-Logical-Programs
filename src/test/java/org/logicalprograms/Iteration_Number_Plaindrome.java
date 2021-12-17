package org.logicalprograms;

public class Iteration_Number_Plaindrome {

	public static void main(String[] args) {

		int inputRemainder = 0; int reverseInputRemainder = 0;
		int input = 12345; int reverseInput = 54321;
		int output1 = 0; int output2 = 0; 

		while (input > 0) {

			inputRemainder = (input % 10);                    // -> Will get "Remainder" of 5 from 12345
			input = (input / 10);                             // -> Will get "Quotient" of 1234 from 12345
		    output1 = (output1 + inputRemainder); 
		} 
		System.out.println("Sum of Output1 :"+ output1);

		while (reverseInput > 0) {

			reverseInputRemainder = (reverseInput % 10);      // -> Will get "Remainder" of 1 from 54321
			reverseInput = (reverseInput / 10);               // -> Will get "Quotient" of 5432 from 54321
		    output2 = (output2 + reverseInputRemainder); 
		} 
		System.out.println("Sum of Output2 :"+ output2);
		
System.out.println("Sum of Output1 :"+ output1 + " = " + "Sum of Output2 :"+ output2);
	
	}
}