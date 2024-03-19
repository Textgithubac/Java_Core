package com.learning.core.Day6;
import java.util.Objects;
import java.util.TreeMap;

class Car implements Comparable<Car>{
	private double price;
	private String name;
	
	public Car(String name, double price) {
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
		Car other = (Car) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	@Override
	public int compareTo(Car other) {
		return Double.compare(this.price, other.price);
	}
}


public class D06P05 {
	public static void main(String[] args) {
		TreeMap<Car, String> carMap = new TreeMap<>();
		
		carMap.put(new Car("Bugatti ",  80050.0), "Bugatti");
		carMap.put(new Car("Swift ",  305000.0), "Swift");
        carMap.put(new Car("Audi ",  600100.0), "Audi");
        carMap.put(new Car("Benz ",  900000.0), "Benz");
        
        for(Car car : carMap.keySet()) {
        	System.out.println(car);
        }
		
	}
}

