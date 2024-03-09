package com.learning.core.Day5;
import java.util.LinkedHashSet;


class Car
{
	private String id;
	private String name;

	public Car(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return  id + " " + name;
	}
	
}
public class D05P03 {
	public static void main(String[] args) 
	{
		
		LinkedHashSet<Car> c = new LinkedHashSet<>();

	    c.add(new Car("P001", "Maruti 800"));
	    c.add(new Car("P002", "Maruti Zen"));
	    c.add(new Car("P003", "Maruti Dezire"));
	    c.add(new Car("P004", "Maruti Alto"));

	    for (Car i : c)
	    {
	      System.out.println(i);
	    }
	
	}

}
