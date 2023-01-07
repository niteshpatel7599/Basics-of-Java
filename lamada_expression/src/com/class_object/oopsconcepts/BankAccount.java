package com.class_object.oopsconcepts;

public class BankAccount {

	/*
	 * Create a bank account class
	 * Create private member variables for Account name , Account number, Account balance
	 * create a method to withdraw and deposit the amount and display current balance.
	 * create an constructor for arguments Account Name, Number and Balance.
	 * Create account main method and create main method in that
	 * create object of account class and call methods from class.
	 */
	
	private String accountName;
	private int accountNumber;
	private double accountBalance;
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public BankAccount() {
	}
	
	public BankAccount(String accountName, int accountNumber, double accountBalance) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	public void deposite(double amount) {
		if(amount > 0) {
			accountBalance = accountBalance + amount;
			System.out.println("Successfully deposited  "+ amount);
		}else {
			System.out.println("Can not deposited  "+ amount);
		}
	}
	
	public void withdrawal(double amount) {
		if(amount > 0) {
			accountBalance = accountBalance - amount;
			System.out.println("Successfully withdrwal  "+ amount);
		}else {
			System.out.println("Can not withdrwal  "+ amount);
		}
	}
	public void displayCurrentBalance() {
		System.out.println("Current Bank Balance : " + accountBalance );
	}
	
	
}
