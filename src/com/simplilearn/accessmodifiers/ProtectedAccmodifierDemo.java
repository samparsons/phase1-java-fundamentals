package com.simplilearn.accessmodifiers;

public class ProtectedAccmodifierDemo {

	public static void main(String[] args) {
		
		Hero hero = new Hero();
		
		//access protected property
		System.out.println("The Power is : "+hero.power);
		hero.usePower();		
		
		//public methods
		hero.showPower();

	}

}