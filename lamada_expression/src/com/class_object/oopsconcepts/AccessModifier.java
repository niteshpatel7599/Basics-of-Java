package com.class_object.oopsconcepts;

public class AccessModifier {

	/* Sequence from more restriction to less restriction while going downward
	 * Private - We can only be use it with in the class.
	 * Default - we can only be use it with in the package
	 * Protected - we can use it outside package only with child class other than we are not able to use outside the package 
	 * Public - we can use any where
	 */
	
	
	
	private void doThis1() {
		System.out.println("This is Private works Here");
	}
	void doThis2() {
		System.out.println("This is default Works here");
	}
	protected void dothis3() {
		System.out.println("This is protected works Here");
	}
	public void doThis4() {
		System.out.println("This is public works Here");
	}
	
	
}
