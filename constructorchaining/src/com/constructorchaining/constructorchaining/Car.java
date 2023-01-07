package com.constructorchaining.constructorchaining;

public class Car {

	Car(int types) {//constructor with an integer parameter
	      System.out.println("constructor with an integer parameter");
	   }
	   Car(String model) {//constructor with a string paramete
		   this(0);
	      System.out.println("constructor with a string parameter");
	   }
	   Car(float milage) {//constructor with a float parameter
		   this(0);
	      System.out.println("constructor with a float parameter");
	   }
	   public static void main(String[] args) {
		Car c1 =new Car(1);
		Car c2 =new Car("2022");
		Car c3 =new Car(45);
		
	}
}
