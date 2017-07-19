package com.cubic.DiceRoller;

public class DiceRoller {

	public static void main(String[] args) {

		Dice d6 = new Dice(6);
		
		Dice d12 = new Dice(12, 1);
		
		int s = d6.roll(6);
		System.out.println("The random number generated is: " + s);
		
		int s1 = d12.roll(12);
		System.out.println("The random number generated with the seed value is: " + s1);
		
		
	}
}
