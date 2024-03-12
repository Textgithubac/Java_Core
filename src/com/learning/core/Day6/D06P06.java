package com.learning.core.Day6;
import java.util.Objects;
import java.util.TreeMap;

class Car1 implements Comparable<Car1>{
	private double price;
	private String name;
	
	public Car1(String name, double price) {
		this.name = name;
		this.price = price;
		}

	@Override
	public String toString() {
		return name+""+ price;
	}
	

    @Override
	public int hashCode() {
    	final int prime = 31;
    	int result = 1;
    	result = prime * result + ((name == null) ? 0: name.hashCode());
    	
    	long temp;
    	temp = Double.doubleToLongBits(price);
    	result = prime * result + (int)(temp ^ (temp >>> 32));
    	return result;
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
		Car1 other = (Car1) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	@Override
	public int compareTo(Car1 other) {
		return Double.compare(this.price, other.price);
	}
}



public class D06P06 {
	public static void main(String[] args) {
		TreeMap<Car1, String> carMap = new TreeMap<>();
		
		carMap.put(new Car1("Bugatti ",  80050.0), "Bugatti");
		carMap.put(new Car1("Swift ",  305000.0), "Swift");
        carMap.put(new Car1("Audi ",  600100.0), "Audi");
        carMap.put(new Car1("Benz ",  900000.0), "Benz");
        
        for(Car1 car : carMap.descendingKeySet()) {
        	System.out.println(car);
        }
     }
}
