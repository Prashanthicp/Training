package com.cashapona.collections.navigableset.jun13;

//Java program to access the elements of NavigableSet
import java.util.*;
import java.io.*;

class AccessElements {

	public static void main(String[] args) {
		NavigableSet<String> ts = new TreeSet<String>();

		// Elements are added using add() method
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("A");

		System.out.println("Navigable Set is " + ts);

		String check = "D";

		// Check if the above string exists in
		// the NavigableSet or not
		System.out.println("Contains " + check + " " + ts.contains(check));

		// Print the first element in
		// the NavigableSet
		System.out.println("First Value " + ts.first());

		// Print the last element in
		// the NavigableSet
		System.out.println("Last Value " + ts.last());
	}
}
