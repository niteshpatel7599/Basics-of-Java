package com.oopsconcepts.constructor;

public class RoadToll {

	String typeOfVehicle;
	int numberOfTyer;
	
	public void tollAmount() {
		int tollAmount;
		if(numberOfTyer == 2) {
			tollAmount = 0;
			System.out.println("Toll Amount is : " + tollAmount);
		}else if (numberOfTyer == 4) {
			tollAmount = 10;
			System.out.println("Toll Amount is : " + tollAmount);
			}
		else if (numberOfTyer > 4) {
			tollAmount = 20;
			System.out.println("Toll Amount is : " + tollAmount);
			}else {
				System.out.println("Incorrect Tire Count");
		}
	}

	public RoadToll() {
		System.out.println("Constructor is excecuted");
	}
	public RoadToll(String typeOfVehicle, int numberOfTyer) {
		this.typeOfVehicle = typeOfVehicle;
		this.numberOfTyer = numberOfTyer;
	}	
}
