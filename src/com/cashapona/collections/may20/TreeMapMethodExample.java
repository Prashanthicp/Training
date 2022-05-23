package com.cashapona.collections.may20;
import java.util.*;  
class TreeMap3{  
 public static void main(String args[]){  
   NavigableMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(545,"Prash");    
      map.put(549,"Ruhi");    
      map.put(546,"Sravani");    
      map.put(567,"Latha");
      
      //Maintains descending order  
      System.out.println("descendingMap: "+map.descendingMap());
      
      //Returns key-value pairs whose keys are less than or equal to the specified key
      System.out.println("headMap: "+map.headMap(549,true));
      
      //Returns key-value pairs whose keys are greater than or equal to the specified key
      System.out.println("tailMap: "+map.tailMap(549,true));
      
      //Returns key-value pairs exists in between the specified key
      System.out.println("subMap: "+map.subMap(545, false, 549, true));   
 }  
}  