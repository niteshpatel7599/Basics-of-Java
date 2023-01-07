package com.exception_handling.exception1;

public class InvalidAccountNumberException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * This will create InsufficentBalanceException with out error message.
	 */
	InvalidAccountNumberException(){
		super();
	}
	
	/*
	 * This will create InsufficentBalanceException with  error message.
	 */
	
	InvalidAccountNumberException(String s){
		super(s);
	}
}
