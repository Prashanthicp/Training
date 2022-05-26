package com.cashapona.oops.may25;

public class MotorBike {
	//state
	private int speed;
	
	MotorBike() {
		this(5);
	}
	
	MotorBike(int speed) {
		this.speed = speed;	
	}
	
    public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed > 0)
		this.speed = speed;
	}
	
	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}
	
	public void decreaseSpeed(int howMuch) {
		this.speed = this.speed - howMuch;
	}
	
	//behaviour
     void start() {
		System.out.println("Bike Started");
		
	}

}
