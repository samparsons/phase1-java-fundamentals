package com.simplilearn.accessmodifiers;

public class DefaultAccessModifierDemo {

	public static void main(String[] args) {
		
		Brother brother = new Brother();
		
		System.out.println("The money "+brother.money);
		System.out.println("The shoes "+brother.shoes);
		
		brother.showAll();

	}

}

class Brother {
	
	/// default properties
	double money =345456;
	String shoes = "XYZ";
	
	// default methods
	void showAll() {
		System.out.println("Money : "+money +"  Shoes : "+shoes);
	}
	
	Brother() {}
	
}