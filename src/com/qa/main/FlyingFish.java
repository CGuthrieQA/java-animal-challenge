package com.qa.main;

public class FlyingFish extends Animal{
	
	protected int age = 1;
	protected String size = "small";
	protected int weight = 800;
	
	public boolean flyingFishMethod() {
		return true;
	}
	
	@Override
	public void fly() {
		System.out.println("i can fly sometimes");
	}

	@Override
	public void swim() {
		System.out.println("i can swim");
	}

	@Override
	public void noise() {
		System.out.println("glub glub");
	}

	@Override
	public void name() {
		System.out.println("glider");
	}

}
