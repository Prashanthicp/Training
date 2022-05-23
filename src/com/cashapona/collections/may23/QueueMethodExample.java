package com.cashapona.collections.may23;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class QueueMethodExample {
	public static void main(String[] args) {
      
	 //adding elements to the queue
	 // PriorityQueue<String> queue=new PriorityQueue<String>();  
	 // queue.add("Violet");
	 // queue.add("Indigo");
	 // queue.add("Blue");
	 // queue.add("Green");
	 // queue.add("Yellow");
	 // System.out.println("Elements of the Priority Queue:");
	 // System.out.println(queue);
	  
	  PriorityQueue<String> queue1 = new PriorityQueue<String>();  
	  queue1.add("Orange");
	  queue1.add("Red");
	  queue1.add("Cyan");
	  System.out.println("Priority Queue1: "+queue1);
	  PriorityQueue<String> queue2 = new PriorityQueue<String>();  
	  queue2.add("Biege");
	  queue2.add("White");
	  queue2.add("Black");
	  System.out.println("Priority Queue2: "+queue2);
	  
	  // adding queue2 to another queue1
	  queue1.addAll(queue2);
	  System.out.println("New Priority Queue1: "+queue1);
	   
	  System.out.println("Original Priority Queue: "+queue1);
	   
	  //Convert Priority Queue to a string representation
	   String str1;
	   str1 = queue1.toString();
	   System.out.println("String representation of the Priority Queue: "+str1);
	   
	    
	   //Convert a linked list to array list  
	   List<String> array_list = new ArrayList<String>(queue1);
	   System.out.println("Array containing all of the elements in the queue: "+array_list);
	    
	   //Inserts the specified element into this priority queue.
	   queue1.offer("Blue");
	 
	   System.out.println("The New Priority Queue: " + queue1);
	    
	    
	   // Removing all the elements from the Priority Queue
	   queue1.clear();
	  
	   System.out.println("The New Priority Queue: " + queue1);
	    
	   // size of the queue
	   System.out.println("Priority Queue: " + queue1);
	   System.out.println("Size of the Priority Queue: " + queue1.size());
	  
	 }
	}
