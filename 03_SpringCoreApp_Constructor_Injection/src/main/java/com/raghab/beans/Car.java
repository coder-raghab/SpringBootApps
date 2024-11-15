package com.raghab.beans;

public class Car {
	
	private Engine engine;

	public Car(Engine engine) {
		super();
		System.out.println("Car::Param-Constructor Calling..");
		this.engine = engine;
	}
	public void drive() {
		int engineStatus=engine.start();
		if(engineStatus >= 1) {
			System.out.println("Car is Running..");
		}else {
			System.out.println("Car is not Running!!!");
		}
	}
}
