package com.exception_handling.exception1;

public class InsufficentBalanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * This will create InsufficentBalanceException with out error message.
	 */
	InsufficentBalanceException(){
		super();
	}
	
	/*
	 * This will create InsufficentBalanceException with  error message.
	 */
	
	InsufficentBalanceException(String s){
		super(s);
	}
}
