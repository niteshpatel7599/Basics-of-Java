package com.oopsconcepts.constructor;

import java.util.Scanner;

public class RoadTollMain {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		RoadToll r1 = new RoadToll("truck", 5);
			
//		System.out.println("Enter Number of tyer");
//		r1.numberOfTyer = sc.nextInt();
		r1.tollAmount();	
	}
}
