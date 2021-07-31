package com.simplilearn.accessmodifiers;

import com.simplilearn.accessmodifiersB.SuperHero;

public class ProtecdtedAccmodifierDemo2 extends SuperHero {

	public static void main(String[] args) {
		
		// SuperHero superhero = new SuperHero();
		// superhero.
		
		// Note : Protected properties or method outside the package is accessible with inheritance.

		ProtecdtedAccmodifierDemo2 accM = new ProtecdtedAccmodifierDemo2();
		System.out.println("The Number : "+accM.number);
		System.out.println("The Power : "+accM.power);
		System.out.println("--------------");
		System.out.println("The Nubmer : "+accM.showNumber());
		System.out.println("The Power : "+accM.showPower());
	}

}