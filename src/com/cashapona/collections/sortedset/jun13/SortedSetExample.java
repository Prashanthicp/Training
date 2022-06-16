package com.cashapona.collections.sortedset.jun13;

//Java program to demonstrate the Sorted Set 
import java.util.*;

class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<String> ts = new TreeSet<String>();

		// Adding elements into the TreeSet using add()
		ts.add("India");
		ts.add("America");
		ts.add("South Africa");

		// Adding the duplicate element
		ts.add("India");

		// Displaying the TreeSet
		System.out.println(ts);

		// Removing items from TreeSet using remove()
		ts.remove("America");
		System.out.println("Set after removing " + "America:" + ts);

		// Iterating over Tree set items
		System.out.println("Iterating over set:");
		Iterator<String> i = ts.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}
}