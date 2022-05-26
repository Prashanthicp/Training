package com.cashapona.oops.may25;

public class MotorBikeRunner {

	public static void main(String[] args) {
		
		MotorBike ducati = new MotorBike(100);
		
		MotorBike honda = new MotorBike(200);
		
		MotorBike somethingElse = new MotorBike(0);
		
        System.out.println(ducati.getSpeed());
		
		System.out.println(honda.getSpeed());
		
		System.out.println(somethingElse.getSpeed());
		
		ducati.start();		
		honda.start();
		
		ducati.setSpeed(100);
		
		ducati.increaseSpeed(100);
		
		honda.increaseSpeed(100);
		
		ducati.decreaseSpeed(50);
		
		honda.decreaseSpeed(50);
		
	//	int ducatiSpeed = ducati.getSpeed();
	//	ducatiSpeed = ducatiSpeed + 100;
	//	ducati.setSpeed(ducatiSpeed);
		
	//	int hondaSpeed = honda.getSpeed();
	//	hondaSpeed = hondaSpeed + 100;
	//	honda.setSpeed(hondaSpeed);
		
		
		
	}

}
