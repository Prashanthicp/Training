package com.cashapona.collections.navigableset.jun13;

//Java Program to remove the
//elements from NavigableSet
import java.util.*;
import java.io.*;

class RemoveElements {

	public static void main(String[] args)
	{
		NavigableSet<String> ts = new TreeSet<String>();

		// Elements are added using add() method
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("B");
		ts.add("D");
		ts.add("E");

		System.out.println("Initial TreeSet " + ts);

		// Removing the element b
		ts.remove("B");

		System.out.println("After removing element " + ts);

		// Remove the First element of TreeSet
		ts.pollFirst();

		System.out.println(
			"After the removal of First Element " + ts);

		// Remove the Last element of TreeSet
		ts.pollLast();

		System.out.println(
			"After the removal of Last Element " + ts);
	}
}
