package com.qa.main;

public class Dog extends Mammal {
	
	protected int age = 7;
	protected String size = "large";
	protected int weight = 5000;

	public boolean dogMethod() {
		return true;
	}
	
	@Override
	public void noise() {
		System.out.println("woof");
	}

	@Override
	public void name() {
		System.out.println("Fido");	
	}

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

	@Override
	public void swim() {
		System.out.println("I can swim");
	}

}
