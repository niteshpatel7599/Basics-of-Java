package com.opps.inheritance;

public class PolyMain {

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle();
		t1.setBaseAndHeight(10.0, 20.98);
		t1.calculateArea();
		Rectriangle r1 = new Rectriangle();
		r1.setBaseAndHeight(20.98, 34.987);
		r1.calculatArea();
		
	}
}
