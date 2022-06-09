package com.cashapona.collections.list.jun08;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
	public static void main(String[] args) {
		
		// Creating an ArrayList of String using
		List<String> animals = new ArrayList<>();

		// Adding new elements to the ArrayList
		animals.add("Lion");
		animals.add("Elephant");
		animals.add("Wolf");
		animals.add("Zebra");

		System.out.println(animals);

		// Adding an element at a particular index in an ArrayList
		animals.add(2, "Dog");

		System.out.println(animals);
	}
}