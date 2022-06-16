package com.cashapona.collections.hashtable.jun14;

//Java program to illustrate Java.util.Hashtable

import java.util.*;

public class HashTable2 {
	public static void main(String[] args) {
		// Create an empty Hashtable
		Hashtable<String, Integer> ht = new Hashtable<>();

		// Add elements to the hashtable
		ht.put("virat", 10);
		ht.put("sachin", 30);
		ht.put("dhoni", 20);

		// Print size and content
		System.out.println("Size of map is:- " + ht.size());
		System.out.println(ht);

		// Check if a key is present and if present, print value
		if (ht.containsKey("virat")) {
			Integer a = ht.get("virat");
			System.out.println("value for key" + " \"virat\" is:- " + a);
		}
	}
}
