package com.cashapona.collections.may23;

import java.util.*;
public class ArrayListMethodExample {
  public static void main(String[] args) {
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Violet");
  list_Strings.add("Indigo");
  list_Strings.add("Blue");
  list_Strings.add("Green");
  list_Strings.add("Yellow");
  System.out.println(list_Strings);
  
//Now insert a color at the first and last position of the list
 list_Strings.add(0, "Orange");
 list_Strings.add(5, "Red");
 
 // Print the list
 System.out.println(list_Strings);
 
 // Retrive the first and third element
 String element = list_Strings.get(0);
 System.out.println("First element: "+element);
 element = list_Strings.get(2);
 System.out.println("Third element: "+element);
 
 //Update the third element with "Yellow"
 list_Strings.set(2, "Yellow");
 // Print the list again
 System.out.println(list_Strings);
 
 //Remove the third element from the list
 list_Strings.remove(2);
 // Print the list again
 System.out.println("After removing third element from the list:\n"+list_Strings);
 
 // Search the value Red
 if (list_Strings.contains("Red")) {
 System.out.println("Found the element");
 } else {
 System.out.println("There is no such element");
 }
 
 //shuffle elements in array list
 System.out.println("List before shuffling:\n" + list_Strings);  
 Collections.shuffle(list_Strings);
 System.out.println("List after shuffling:\n" + list_Strings); 
 
//reverse elements in array list
 System.out.println("List before reversing :\n" + list_Strings);  
 Collections.reverse(list_Strings);
 System.out.println("List after reversing :\n" + list_Strings);
 
//extract a portion of array list
 System.out.println("Original list: " + list_Strings);
 List<String> sub_List = list_Strings.subList(0, 3);
 System.out.println("List of first three elements: " + sub_List);
  
 ArrayList<String> c1= new ArrayList<String>();
 c1.add("Red");
 c1.add("Green");
 c1.add("Black");
 c1.add("White");
 c1.add("Pink");

 ArrayList<String> c2= new ArrayList<String>();
 c2.add("Red");
 c2.add("Green");
 c2.add("Black");
 c2.add("Pink");

 //Storing the comparison output in ArrayList<String>
 ArrayList<String> c3 = new ArrayList<String>();
 for (String e : c1)
    c3.add(c2.contains(e) ? "Yes" : "No");
 System.out.println(c3);
 
 //joining above two list
 ArrayList<String> a = new ArrayList<String>();
 a.addAll(c1);
 a.addAll(c2);
 System.out.println("New array list: " + a);
 
 //Array list after cloning array list
 System.out.println("Original array list: " + c1);
 ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
 System.out.println("Cloned array list: " + newc1);
 
 
//trim the capacity of an array list the current list size
System.out.println("Original array list: " + c1);
System.out.println("Let trim to size the above array: ");
c1.trimToSize();
System.out.println(c1);
 
//printing the position of the elements
System.out.println("\nOriginal array list: " + c1);
System.out.println("\nPrint using index of an element: ");
int no_of_elements = c1.size();
for (int index = 0; index < no_of_elements; index++)
 System.out.println(c1.get(index));

 //check whether array list is empty or not
 System.out.println("Original array list: " + c1);
 System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());
 
 //Array list after removing all elements
 System.out.println("Original array list: " + c1);
 c1.removeAll(c1);
 System.out.println("Array list after remove all elements "+c1);
 
   }
  }

