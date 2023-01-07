package com.exception_handling.exception1;

public class BankService {

	int balance =5000;
	
	public void withdraw(int accNo, int amount) throws InvalidAccountNumberException, InsufficentBalanceException {
		
		if(accNo != 101) {
			throw new InvalidAccountNumberException("Your Account Number is Not Valid" );
		}
		if(amount > balance) {
			throw new InsufficentBalanceException("You do not have sufficent balance to withdraw money");
		}
		System.out.println("Amount Withdraw from account :"+ accNo);
		System.out.println("Initial Balance :" + balance);
		balance = balance -amount;
		System.out.println("Amount withdraw :" + amount);
		System.out.println("Available balance :" + balance);
	}
}
