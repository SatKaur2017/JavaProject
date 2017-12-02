package oopsConcepts;

public abstract class Bikes {
public void seat()
{
	System.out.println("Bike Seat"+"Every bike has seat");
}
	public void handle()
{
	System.out.println("Bike handle"+"Every bike has handle");
}
	public abstract void engine();
	public abstract void wheels();
}

