package com.class_object.oopsconcepts;

public class StaticKeywordMain {

	public static void main(String[] args) {
		StaticKeyword st1 = new StaticKeyword();
		StaticKeyword st2 = new StaticKeyword();
		StaticKeyword.name="Mahesh";
		st1.age =7;
		st1.grade = "2nd";
		
		StaticKeyword.name="Ramesh";
		st2.age =8;
		st2.grade = "3rd";
		
		st1.displayDetails();
		st2.displayDetails();
		StaticKeyword.doThis();
		
	}
	
}
