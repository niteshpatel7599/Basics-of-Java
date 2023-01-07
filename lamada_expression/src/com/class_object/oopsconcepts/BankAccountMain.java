package com.class_object.oopsconcepts;

import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {

		BankAccount bank1 = new BankAccount("Nitesh Patel", 1234567, 10000);
		bank1.displayCurrentBalance();
		bank1.withdrawal(2000);
		bank1.displayCurrentBalance();
	}
}
