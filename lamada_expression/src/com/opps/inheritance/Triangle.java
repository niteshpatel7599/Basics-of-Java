package com.opps.inheritance;

public class Triangle extends Polygon {

	public void calculateArea() {
		System.out.println("Area of the triangle is " + (base*height)/2);
	}
}
