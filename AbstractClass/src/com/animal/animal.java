package com.animal;
abstract class animal
{
	public abstract void sound();
}
public class Lion extends animal
{
	public void sound()
	{
		System.out.println("Roar");
	}
	public static void main(String args[])
	{
		animal obj = new Lion();
		obj.sound();
	}
}
