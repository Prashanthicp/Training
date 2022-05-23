package com.cashapona.collections.may20;

import java.util.*;  
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
	  
public class MapInterfaceMethodsExample { 
	
	public static void main(String[] args) {
	    //creating map
	     Map<String, String> country_map = new HashMap<>();
	     
	     //assign values to the map
	     country_map.put("IND", "India"); 
	     country_map.put("SL", "Srilanka");
	     country_map.put("CHN", "China");
	     country_map.put("KOR", "Korea"); 
	     country_map.put(null, "Z"); // null key
	     country_map.put("XX", null); // null value
	     
	    // get 
	     String value = country_map.get("CHN");
	     System.out.println("Key = CHN, Value : " + value);
	     
	    //getOrDefault
	     value = country_map.getOrDefault("XX", "Default Value");
	     System.out.println("\nKey = XX, Value : " + value);
	     
	   //containsKey
	     boolean keyExists = country_map.containsKey(null);
	     
	   //containsValue
	     boolean valueExists = country_map.containsValue("Z");
	  
	     System.out.println("\nnull keyExists : " + keyExists + ", null valueExists= " + valueExists);
	  
	   //entrySet
	     Set<Entry<String, String>> entrySet = country_map.entrySet();  
	     System.out.println("\nentry set for the country_map: " + entrySet);
	     
	   //size
	     System.out.println("\nSize of country_map : " + country_map.size());
	  
	     Map<String, String> data_map = new HashMap<>();
	   //putAll
	     data_map.putAll(country_map);       
	     System.out.println("\ndata_map mapped to country_map : " + data_map);
	  
	   //remove
	     String nullKeyValue = data_map.remove(null);  
	     System.out.println("\nnull key value for data_map : " + nullKeyValue);
	     System.out.println("\ndata_map after removing null key = " + data_map);
	  
	   //keySet
	     Set<String> keySet = country_map.keySet();      
	     System.out.println("\ndata map keys : " + keySet);
	  
	    //values
	      Collection<String> values = country_map.values();
	      System.out.println("\ndata map values : " + values);
	      
	     //clear
	      country_map.clear();      
	      System.out.println("\ndata map after clear operation, is empty :" + country_map.isEmpty());
	      
	     }
	 }
