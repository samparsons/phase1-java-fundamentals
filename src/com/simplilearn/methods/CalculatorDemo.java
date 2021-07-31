package com.simplilearn.methods;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		int x = 50;
		int y = 20;
		System.out.println("X is "+x+", Y is "+y+" and Addition :"+calculator.add(x, y));
		System.out.println("X is "+x+", Y is "+y+" and subtraction :"+calculator.sub(x, y));
		System.out.println("X is "+x+", Y is "+y+" and division :"+calculator.div(x, y));
		System.out.println("X is "+x+", Y is "+y+" and average :"+calculator.avg(x, y));
		//if static
		System.out.println("X is "+x+", Y is "+y+" and multiplication :"+Calculator.mul(x, y));
		
		
		
		

	}

}

class Calculator {
	// add
	public float add(int num1,int num2) {
		float result = num1 + num2;
		return result;
	}
	//sub
	public float sub(int num1,int num2) {
		float result = num1 - num2;
		return result;
	}
	
	//div
	public float div(int num1,float num2) {
		float result = num1 / num2;
		return result;
	}
	//mult
	static float mul(int num1,float num2) {
		float result = num1 * num2;
		return result;
	}
	//avg
	
	public float avg(int num1,float num2) {
		float result = (num1 + num2) / 2;
		return result;
	}
}