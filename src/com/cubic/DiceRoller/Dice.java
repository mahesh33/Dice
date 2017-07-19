package com.cubic.DiceRoller;

import java.util.Random;

public class Dice {

	private int sides;
	private int values;
	Random generator;

	public Dice(int sides) {
		this.sides = sides;
		this.generator = new Random();
	}

	public Dice(int sides, int seeds){
		this.sides = sides;
		this.generator = new Random(seeds);
	}

	public int roll(int sides) {
		return this.values = generator.nextInt(sides) + 1;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public int getValues() {
		return values;
	}

	public void setValues(int values) {
		this.values = values;
	}

}
