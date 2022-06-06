package com.cashapona.exceptionhandling.may26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//Java program to demonstrate user defined exception

//This program throws an exception whenever balance amount is below Rs 1000
class MyException extends exception
{
	//store account information
	private static int accno[] = {0545, 0546, 0547, 0567};

	private static String name[] =
				{"Prash", "Sravs", "Ruhi", "Latha"};

	private static double bal[] =
		{10000.00, 12000.00, 5600.0, 999.00, 1100.55};

	// default constructor
	MyException() { }

	// parameterized constructor
	
	MyException(String str) { super(); }


	public static void main(String[] args)
	{
		try {
			// display the heading for the table
			System.out.println("ACCNO" + "\t" + "CUSTOMER" +
										"\t" + "BALANCE");

			// display the actual account information
			for (int i = 0; i < 5 ; i++)
			{
				System.out.println(accno[i] + "\t" + name[i] +
											"\t" + bal[i]);

				 //display own exception if balance < 1000
				if (bal[i] < 1000)
				{
					MyException me =
					new MyException("Balance is less than 1000");
				//	throw me;
				}
		
			//ArithmeticException occurs
		 try {
	            int a = 30, b = 0;
	            int c = a/b;  // cannot divide by zero
	            System.out.println ("Result = " + c);
	        }
	        catch(ArithmeticException e) {
	            System.out.println ("Can't divide a number by 0..");
	        }
		 
		 //NullPointerException occurs
		 try {
	            String a = null; //null value
	            System.out.println(a.charAt(0));
	        } catch(NullPointerException e) {
	            System.out.println("NullPointerException..");
	        }

		 //StringIndexOutOfBound exception occurs
		 try {
	            String a = "This is like chipping "; // length is 22
	            char c = a.charAt(24); // accessing 25th element
	            System.out.println(c);
	        }
	        catch(StringIndexOutOfBoundsException e) {
	            System.out.println("StringIndexOutOfBoundsException..");
	        }
		 
		 //FileNotFoundException exception occurs
		 try {
			 
	            // Following file does not exist
	            File file = new File("E://file.txt");
	 
	            FileReader fr = new FileReader(file);
	        } catch (FileNotFoundException e) {
	           System.out.println("File does not exist");
	        }
		 
		 //NumberFormatException exception occurs
		 try {
	            // "akhil" is not a number
	            int num = Integer.parseInt ("akhil") ;
	 
	            System.out.println(num);
	        } catch(NumberFormatException e) {
	            System.out.println("Number format exception");
	        }
		 
           //ArrayIndexOutOfBoundsException exception occurs
	        try{
	            int a[] = new int[5];
	            a[6] = 9; // accessing 7th element in an array of
	                      // size 5
	        }
	        catch(ArrayIndexOutOfBoundsException e){
	            System.out.println ("Array Index is Out Of Bounds");
	        }
		finally {
			System.out.println("finally block executed");
	}
			}
		}
	        finally { }
		}
}