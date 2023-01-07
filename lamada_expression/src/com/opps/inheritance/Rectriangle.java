package com.opps.inheritance;

public class Rectriangle extends Polygon{
/*
 * rectriangle is a polygon
 * When ever we extends in the inheritance there is ISA relationship from child to parent class
 */
	public void calculatArea() {
		System.out.println("Area of Rectriangle " + (base* height));
	}
}
