package com.exception_handling.exception1;

public class CheckBankService {

	public static void main(String[] args) throws InvalidAccountNumberException, InsufficentBalanceException{
		BankService bankService = new BankService();
		bankService.withdraw(100,2000);
	}
}
