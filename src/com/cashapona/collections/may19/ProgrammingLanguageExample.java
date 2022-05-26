package com.cashapona.collections.may19;

import java.util.*;
class ProgrammingLanguageExample{
 public static void main(String args[]){
 TreeSet<String> set=new TreeSet<String>();
         set.add("Java");
         set.add("Python");
         set.add("C++");
         set.add("C");
         set.add("Oracle");
         System.out.println("Traversing element through Iterator in descending order"); 
         
         // traversing elements in descending order
         Iterator i=set.descendingIterator();
         while(i.hasNext())  
         {  
             System.out.println(i.next());
         }
         
         //retrieve and printing lowest value
         System.out.println("Lowest Value: "+set.pollFirst());
         
         //retrieve and printing highest value
         System.out.println("Highest Value: "+set.pollLast());
         
         //printing the initial set
         System.out.println("Initial Set: "+set);
         
         //printing elements in reverse order
         System.out.println("Reverse Set: "+set.descendingSet());
         
          //printing headset  
         System.out.println("Head Set: "+set.headSet("C++", true));
         
         //printing subset 
         System.out.println("SubSet: "+set.subSet("Java", false, "Oracle", true));
         
         //printing tailset
         System.out.println("TailSet: "+set.tailSet("C++", false));  
 }  
}  
