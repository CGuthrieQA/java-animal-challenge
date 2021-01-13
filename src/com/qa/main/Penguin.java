package com.qa.main;

public class Penguin extends Animal {

	protected int age = 8;
	protected String size = "large";
	protected int weight = 7000;

	public boolean penguinMethod() {
		return true;
	}
	
	@Override
	public void fly() {
		System.out.println("no I can't");
	}

	@Override
	public void swim() {
		System.out.println("yes I can");
		
	}

	@Override
	public void noise() {
		System.out.println("noot noot");
		
	}

	@Override
	public void name() {
		System.out.println("not pingu");
		
	}

}
