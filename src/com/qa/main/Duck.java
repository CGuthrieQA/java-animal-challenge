package com.qa.main;

public class Duck extends Animal {
	
	protected int age = 2;
	protected String size = "medium";
	protected int weight = 600;

	public boolean duckMethod() {
		return true;
	}
	
	@Override
	public void noise() {
		System.out.println("cluck cluck");
	}

	@Override
	public void name() {
		System.out.println("Roast");
	}

	@Override
	public void fly() {
		System.out.println("I can fly");
	}

	@Override
	public void swim() {
		System.out.println("I can swim");
	}

}
