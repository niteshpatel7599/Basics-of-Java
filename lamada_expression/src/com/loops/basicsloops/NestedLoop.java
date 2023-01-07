package com.loops.basicsloops;

public class NestedLoop {

	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <=5; j++) {
				for (int j2 = 1; j2 < 5; j2++) {
					for (int k = 1; k <4; k++) {
						System.out.println(i + "," + j + "," + j2 + "," + k);
					}System.out.println("Iteration of J Value");
				}System.out.println("Iteration of J2 Value");
			}System.out.println("Iteration of k Value");
			
		}
	}
}
