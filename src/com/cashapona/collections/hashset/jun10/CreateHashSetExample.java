package com.cashapona.collections.hashset.jun10;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {
	public static void main(String[] args) {
		// Creating a HashSet
		Set<String> monthsOfYear = new HashSet<>();

		// Adding new elements to the HashSet
		monthsOfYear.add("January");
		monthsOfYear.add("Febraury");
		monthsOfYear.add("March");
		monthsOfYear.add("April");
		monthsOfYear.add("May");
		monthsOfYear.add("June");
		monthsOfYear.add("July");
		monthsOfYear.add("August");
		monthsOfYear.add("September");
		monthsOfYear.add("October");
		monthsOfYear.add("November");
		monthsOfYear.add("December");

		// Adding duplicate elements will be ignored
		monthsOfYear.add("January");

		System.out.println(monthsOfYear);
	}
}