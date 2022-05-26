package com.cashapona.oops.may24;

import java.util.ArrayList;

class AutoboxingUnboxing
{
    public static void main(String[] args)
    {
        char ch = 'a';
  
        // Autoboxing- primitive to Character object conversion
        Character a = ch;
  
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
  
        // Autoboxing because ArrayList stores only objects
        arrayList.add(25);
  
        // printing the values from object
        System.out.println(arrayList.get(0));
        
        
        // unboxing - Character object to primitive conversion
        char a2 = ch;
  
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList.add(24);
  
        // unboxing because get method returns an Integer object
        int num = arrayList2.get(0);
  
        // printing the values from primitive data types
        System.out.println(num);
    }
}
