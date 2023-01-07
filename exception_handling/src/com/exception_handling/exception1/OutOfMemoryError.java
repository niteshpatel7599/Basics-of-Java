package com.exception_handling.exception1;

public class OutOfMemoryError {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		while(true) {
			sb.append("friends");
		}
	}
}
