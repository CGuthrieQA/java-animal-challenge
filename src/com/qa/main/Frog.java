package com.qa.main;

public class Frog extends Animal {
	
	protected int age = 1;
	protected String size = "small";
	protected int weight = 200;

	@Override
	public void noise() {
		System.out.println("croak");
	}

	@Override
	public void name() {
		System.out.println("Hoppy");
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
