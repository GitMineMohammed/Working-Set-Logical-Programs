package org.logicalprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iteration_Number_ArrayList {

	public static void main(String[] args) {

		int i;
		System.out.println("Iterated using AsList :");
		List<Integer> asListRef = Arrays.asList(10, 20, 30, 40, 50);
		for (i = 0; i < asListRef.size(); i++) {
			Integer element = asListRef.get(i);
			System.out.print(element + " ");
		}

		System.out.println("\n" + "Iterated using List :");
		List<Integer> listRef = new ArrayList<Integer>();
		listRef.add(10);
		listRef.add(20);
		listRef.add(30);
		listRef.add(40);
		listRef.add(50);
		for (i = 0; i < listRef.size(); i++) {
			Integer element1 = listRef.get(i);
			System.out.print(element1 + " ");
		}
	}
}