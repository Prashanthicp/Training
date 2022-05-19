package com.cashapona.collections.may19;

import java.util.HashSet;

public class FirstExample {
  public static void main(String[] args) {
    HashSet<String> vowelSet = new HashSet<>();
 
    //Adding elements to the HashSet
    vowelSet.add("A");
    vowelSet.add("E");
    vowelSet.add("I");
    vowelSet.add("O");
    vowelSet.add("U");
   
    //Printing the elements
    System.out.println("Values in the vowel set are:="+vowelSet);
 
    //Creating a new Set
    HashSet<String> consonantSet = new HashSet<>();
    consonantSet.add("A");
    consonantSet.add("B");
    consonantSet.add("C");
    consonantSet.add("D");
     
    //Printing the elements
    System.out.println("Values in the consonant set are:="+consonantSet);
     
    //Intersection of two sets
    vowelSet.retainAll(consonantSet);
    System.out.println("The result of intersection of two sets is:="+vowelSet);
 
    //Union of two sets
    consonantSet.addAll(vowelSet);
    System.out.println("Values in the set after union of sets:="+consonantSet);
     
    //Difference between two sets
    consonantSet.removeAll(vowelSet);
    System.out.println("The result of difference between two sets is :="+consonantSet);

    //To check if the set empty or not
    System.out.println("Is the vowelSet empty ? " +vowelSet.isEmpty());
       
    //Print the length of consonantSet
    System.out.println("Size of the consonantSet is :=" +consonantSet.size());
       
    //To check if set contains 'E' or not
    System.out.println("Does the consonantSet contain 'E'?"+consonantSet.contains("E"));
    
  //Deleting one element from consonantSet
    consonantSet.remove("B");
    System.out.println("Set after removing 'B' := " +consonantSet);
 
    //Deleting all the elements from consonantSet.
    consonantSet.removeAll(consonantSet);
    System.out.println("Set after deleting all the elements altogether:= "+consonantSet);
    
  }
}
