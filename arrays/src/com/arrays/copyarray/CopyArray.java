package com.arrays.copyarray;

public class CopyArray {

	public static void main(String[] args) {
		int local;
		int b[] = {9,2,13,6,6};
		for (int i = 2; i < b.length; i++) {
			if(b[i] == b[i-1]) {
				
				System.out.println(b[i+1]+"See now duplicate");
			}else {
				System.out.println("losser");
			}
		}
	}

}
