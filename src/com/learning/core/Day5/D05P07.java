package com.learning.core.Day5;
import java.util.Objects;
import java.util.TreeSet;

class Tree implements Comparable<Tree> {
    private int id;
    private String name;
    private double salary;

    public Tree(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
@Override
    public int compareTo(Tree other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
			return true;
		}
        if (o == null || getClass() != o.getClass()) {
			return false;
		}
        Tree person = (Tree) o;
        return id == person.id &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

	
}
public class D05P07 {
	public static void main(String[] args) {
        TreeSet<Tree> persons = new TreeSet<>();
        
       
        persons.add(new Tree(1, "Jerry", 999.0));
        persons.add(new Tree(2, "Smith", 2999.0));
        persons.add(new Tree(3, "Popeye", 5999.0));
        persons.add(new Tree(4, "Jones", 6999.0));
        persons.add(new Tree(5, "John", 1999.0));
        persons.add(new Tree(6, "Tom", 3999.0));

        for (Tree person : persons) {
            System.out.println(person);
        }
    }

}
