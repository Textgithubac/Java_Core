package com.learning.core.Day6;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;

class Car6 implements Comparable<Car6>
{
	private String name;
	private double price;
	
	public Car6() 
	{
		super();
	}

	public Car6(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Car6 other = (Car6) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString() {
		return name + " " + price;
	}

	@Override
	public int compareTo(Car6 o) 
	{
		 return (int) (o.price - this.price);
	}
	
}


public class D06P09 {
	public static void main(String[] args) {
		TreeMap<Integer,Car6> car= new TreeMap<>();
		
		car.put(1,new Car6("Bugatti",80050));
		car.put(2,new Car6("Swift",305000));
		car.put(3,new Car6("Audi",600100));
		car.put(4,new Car6("Benz",900000));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price: ");
		Double p =sc.nextDouble();
		System.out.println("Enter the new name: ");
		String nn =sc.next();

		for (Map.Entry<Integer, Car6> e: car.entrySet()) 
		 {
			 Car6 c=e.getValue();
			 if(c.getPrice()== p)
			 {
				 c.setName(nn);
				 System.out.println(c);
			 }
	     }
	}

}
