package com.cashapona.collections.list.jun08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Latha");
		names.add("Prash");
		names.add("Sravs");
		names.add("Ruhi");

		System.out.println("Names : " + names);

		// Sort an ArrayList using its sort() method. You must pass a Comparator to the
		// ArrayList.sort() method.
		names.sort(new Comparator<String>() {
			@Override
			public int compare(String name1, String name2) {
				return name1.compareTo(name2);
			}
		});

		// The above `sort()` method call can also be written simply using lambda
		// expression
		names.sort((name1, name2) -> name1.compareTo(name2));

		// Following is an even more concise solution
		names.sort(Comparator.naturalOrder());

		System.out.println("Sorted Names : " + names);
	}
}