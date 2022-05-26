package com.cashapona.oops.may25;

public class BookRunner {

	public static void main(String[] args) {
		
		//creating new class with three instances
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(50);
		Book CleanCode = new Book(40);
		
		artOfComputerProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(50);
		CleanCode.setNoOfCopies(45);

	}

}
