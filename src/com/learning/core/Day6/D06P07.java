package com.learning.core.Day6;
import java.util.Map;
import java.util.TreeMap;

class Car2 implements Comparable<Car2> {
    private double price;
    private String name;

    public Car2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
			return true;
		}
        if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
        Car2 other = (Car2) obj;
        return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
                && name.equals(other.name);
    }

    @Override
    public int compareTo(Car2 other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P07 {
	   public static void main(String[] args) {
	        TreeMap<Car2, String> carMap = new TreeMap<>();

	        // Add predefined information to the TreeMap
	        carMap.put(new Car2("Bugatti ", 80050.0), "");
	        carMap.put(new Car2("Swift ", 305000.0), "");
	        carMap.put(new Car2("Audi ", 600100.0), "");
	        carMap.put(new Car2("Benz ", 900000.0), "");
	        
	        Map.Entry<Car2, String> greatestPriceEntry = carMap.lastEntry();
	        System.out.println(greatestPriceEntry.getKey() + " "+ greatestPriceEntry.getValue());
	        
	        Map.Entry<Car2, String> leastPriceEntry = carMap.firstEntry();
	        System.out.println(leastPriceEntry.getKey() + " " + leastPriceEntry.getValue());
	   }

}
