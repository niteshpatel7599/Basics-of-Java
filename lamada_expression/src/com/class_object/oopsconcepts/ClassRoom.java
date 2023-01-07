package com.class_object.oopsconcepts;

public class ClassRoom {

	private String subject1;
	private int studentCount1;

	public String getSubject() {
		return subject1;
	}

	public void setSubject(String subject) {
		this.subject1 = subject;
	}

	public int getStudentCount() {
		return studentCount1;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount1 = studentCount;
	}

	public void displayDetails() {
		System.out.println("This is a  " + subject1 + "Class Room it has " + studentCount1 + " No of Student");

	}

	
}
