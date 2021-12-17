package org.logicalprograms;

public class Iteration_String_Reverse_Order_Of_Words {

	public static void main(String[] args) {

		String input = "Java Programm";
		String output = "";

		String[] split = input.split(" ");

		for (String newString : split) {

			for (int i = newString.length() - 1; i >= 0; i--) {
				char charAt = newString.charAt(i);
				output = output + charAt;
			}
			output = (output + " ");
		}
		System.out.println(output);

	}
}
