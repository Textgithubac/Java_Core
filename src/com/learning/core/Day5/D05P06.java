package com.learning.core.Day5;
import java.util.TreeSet;

class Person4 implements Comparable<Person4> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person4(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id-" + id + ", name " + name + ", age-" + age + ", salary-" + salary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
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
        Person4 other = (Person4) obj;
        if (id != other.id) {
			return false;
		}
        return true;
    }

    @Override
    public int compareTo(Person4 other) {
        return Integer.compare(this.id, other.id);
    }
}

public class D05P06 {
	public static void main(String[] args) {
        // Create a TreeSet to store Person objects with natural sorting
        TreeSet<Person4> persons = new TreeSet<>();

        // Add predefined person details to the TreeSet
        persons.add(new Person4(1, "Alice", 12, 1500.0));
        persons.add(new Person4(2, "Bob", 15, 2500.0));
        persons.add(new Person4(3, "Charlie", 19, 2000.0));
        persons.add(new Person4(4, "David", 18, 3000.0));
        persons.add(new Person4(5, "John", 32, 1999.0));
        persons.add(new Person4(6, "Tom", 42, 3999.0));

        // Print all the Person details whose age is greater than 25
        
        for (Person4 person : persons) {
            if (person.getAge() > 25) {
                System.out.println(person);
            }
        }
        
    }

}
