package com.cashapona.collections.list.jun08;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ayesha");
        names.add("Ruhi");
        names.add("Prash");
        names.add("Sravs");
        names.add("Ayesha");
        names.add("Sravs");
        names.add("Maria");

        // Check if an ArrayList contains a given element
        System.out.println("Does names array contain \"Prash\"? : " + names.contains("Prash"));

        // Find the index of the first occurrence of an element in an ArrayList
        System.out.println("indexOf \"Sravs\": " + names.indexOf("Sravs"));
        System.out.println("indexOf \"Latha\": " + names.indexOf("Latha"));

        // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf \"Ayesha\" : " + names.lastIndexOf("Ayesha"));
        System.out.println("lastIndexOf \"Ramya\" : " + names.lastIndexOf("Ramya"));
    }
}