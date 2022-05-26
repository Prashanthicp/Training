package com.cashapona.oops.may25;

public class Book {

	private int noOfCopies;
	
	public Book(int noOfCopies) {
		
	}

	public void setNoOfCopies(int noOfCopies) {
		if(noOfCopies > 0)
		this.noOfCopies = noOfCopies;
	}

	public void increaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}
	
	public void decreaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	
 }
}