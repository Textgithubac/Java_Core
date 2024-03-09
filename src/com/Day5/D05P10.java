package com.Day5;
import java.util.Objects;
import java.util.TreeSet;

class Person6 implements Comparable<Person6> 
{
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person6(int id, String name, int age, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public double getSalary() 
    {
        return salary;
    }

    @Override
    public String toString() 
    {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(id, name, age, salary);
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
			return true;
		}
        if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
        Person6 person = (Person6) obj;
        return id == person.id &&
                age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name);
    }

    @Override
    public int compareTo(Person6 other) 
    {
        return Integer.compare(this.id, other.id);
    }
}


public class D05P10 {
	  public static void main(String[] args) 
	    {
	        TreeSet<Person6> people = new TreeSet<>();
	        
	        people.add(new Person6(1, "Gaurav", 30, 5000));
	        people.add(new Person6(2, "Vikas", 25, 6000));
	        people.add(new Person6(3, "Bobby", 35, 5500));
	        people.add(new Person6(4, "Jones", 22, 6999));
	        people.add(new Person6(5, "Jonny", 28, 6500));
	        people.add(new Person6(6, "Jack", 40, 7000));

	        
	        for (Person6 person : people) 
	        {
	            if (person.getName().startsWith("J")) 
	            {
	                System.out.println(person);
	                break;
	            }
	        }
	    }

}
