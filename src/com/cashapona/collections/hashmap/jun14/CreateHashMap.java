package com.cashapona.collections.hashmap.jun14;

//Java program to illustrate HashMap class of java.util

import java.util.HashMap;

//Main class
public class CreateHashMap {

	// Main driver method
	public static void main(String[] args) {
		// Create an empty hash map by declaring object
		// of string and integer type
		HashMap<String, Integer> map = new HashMap<>();

		// Adding elements to the Map using standard put() method
		map.put("dhoni", 10);
		map.put("sachin", 30);
		map.put("dravid", 20);

		// Print size and content of the Map
		System.out.println("Size of map is:- " + map.size());

		// Printing elements in object of Map
		System.out.println(map);

		// Checking if a key is present and if present, print value by passing random element
		if (map.containsKey("dhoni")) {

			// Mapping
			Integer a = map.get("dhoni");

			// Printing value for the corresponding key
			System.out.println("value for key" + " \"dhoni\" is:- " + a);
		}
	}
}
