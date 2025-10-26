package com.app.fruits;

public class Mango extends Fruit
{
	public Mango(String color, double weight, String name, boolean isFresh)
    {
    	super(name,weight,name,isFresh);
    }
	public Mango() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Fruit [Color : " + getColor() + " Weight: "+ getWeight() + " Name: "+ getName() + " is Fresh: "+ isFresh() +" ]";
	}
	@Override
	public String taste()
	{
		return "Sweet";
	}

}

