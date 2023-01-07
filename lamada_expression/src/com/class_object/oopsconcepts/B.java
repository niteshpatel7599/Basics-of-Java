package com.class_object.oopsconcepts;

public class B extends  A {

	public void doThis() {
		System.out.println("Do this from B");
	}
	public void xyz() {
		super.doThis();
		System.out.println("xyz is excecuted");
	}
}
