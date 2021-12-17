package org.logicalprograms;

public class Iteration_Number_Array {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int i;
		int arrayNumbers;

		int arrayLength = array.length;
		System.out.print("Length of Array is " + arrayLength + "\n");

		System.out.println("Iterated using for loop :");
		for (i = 0; i < arrayLength; i++) {
			arrayNumbers = array[i];
			System.out.print(arrayNumbers + " ");
		}

		System.out.println("\n" + "Iterated using for each :");
		for (int seperatedNumber : array) {
			System.out.print(seperatedNumber + " ");
		}
	}
}