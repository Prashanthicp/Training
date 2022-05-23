package com.cashapona.collections.may23;

import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListMethodExample {
public static void main(String[] args) {
   // create an empty linked list
   LinkedList<String> l_list = new LinkedList<String>();
   //use add() method to add values in the linked list
        l_list.add("Violet");
        l_list.add("Indigo");
        l_list.add("Black");
        l_list.add("Green");
        l_list.add("Yellow");
        l_list.add("Orange");
        l_list.add("Red");
   //print the list
   System.out.println("The linked list: " + l_list);
   
   for (String element : l_list) {
	    System.out.println(element);
	    }
   
   //print original list
   System.out.println("Original linked list:" + l_list);  
 
   Iterator it = l_list.descendingIterator();

   //Print list elements in reverse order
    System.out.println("Elements in Reverse Order:");
     while (it.hasNext()) {
        System.out.println(it.next());
        
    //Add an element to front of LinkedList
     l_list.offerFirst("Black");
     System.out.println("First linked list:" + l_list); 
        
    //Add an element at the end of list 
     l_list.addLast("White");
     System.out.println("Final linked list:" + l_list);
    

     // Remove the element in third position from the linked list
     l_list.remove(2);
     System.out.println("The New linked list: " + l_list);
     
    //print original list and elements position
     System.out.println("Original linked list:" + l_list);  
    for(int p=0; p < l_list.size(); p++)
     {
        System.out.println("Element at index "+p+": "+l_list.get(p));    
     }           
 }
}
}