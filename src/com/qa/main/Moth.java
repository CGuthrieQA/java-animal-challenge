package com.qa.main;

public class Moth extends Animal {
	
	protected int age = 1;
	protected String size = "tiny";
	protected int weight = 10;

	public boolean mothMethod() {
		return true;
	}
	
	@Override
	public void noise() {
		System.out.println("flutter");
	}

	@Override
	public void name() {
		System.out.println("Mothman");
	}

	@Override
	public void fly() {
		System.out.println("I can fly");
	}

	@Override
	public void swim() {
		System.out.println("I can't swim");
	}

}
