package com.qa.main;

public abstract class Animal implements Flyable, Swimable {
	
	protected int age;
	protected String size;
	protected int weight;
	
	public abstract void noise();
	
	public abstract void name();
	
}
