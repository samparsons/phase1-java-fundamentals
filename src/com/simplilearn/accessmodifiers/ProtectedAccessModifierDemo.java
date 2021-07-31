package com.simplilearn.accessmodifiers;

public class ProtectedAccessModifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero();
		// accesss protected property
		System.out.println("The power is : "+hero.power+".");
		hero.usePower();
		
		// public methods
		hero.showPower();
		
	}

}

