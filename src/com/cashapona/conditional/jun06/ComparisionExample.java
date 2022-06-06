package com.cashapona.conditional.jun06;

import java.util.Scanner;

public class ComparisionExample {
 
    public static void main(String[] args) {
         
        System.out.println("Enter the ages of Prash, Latha, and Sravs: ");
         
        // Taking input from the console
         
        int Prash, Latha, Sravs;
        Scanner in = new Scanner(System.in);
        Prash = in.nextInt();
        Latha = in.nextInt();
        Sravs = in.nextInt();
         
        // conditional check for age criteria
         
        if((Prash > Latha)&& (Prash> Sravs)){
            System.out.println("Prash is oldest");
        }
         
        else if((Latha > Prash)&& (Latha> Sravs)){
            System.out.println("Latha is oldest");
        }
         
        else if((Sravs > Prash)&& (Sravs> Latha)){
            System.out.println("Sravs is oldest");
        }
        else{
            System.out.println("They are of same age");
        }
          
    }
 
}