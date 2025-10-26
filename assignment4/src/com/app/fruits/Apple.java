package com.app.fruits;

public class Apple extends Fruit {
	
	public Apple(String color, double weight, String name, boolean isFresh)
    {
    	super(name,weight,name,isFresh);
    }
	
	@Override
	public String toString() {
		return "Fruit [Color : " + getColor() + " Weight: "+ getWeight() + " Name: "+ getName() + " is Fresh: "+ isFresh() +" ]";
	}
	
	@Override
	public String taste() {
		return "Sweet and sour";
	}
}
