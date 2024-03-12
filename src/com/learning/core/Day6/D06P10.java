package com.learning.core.Day6;
import java.util.Hashtable;
import java.util.Objects;

class Employee
{
	private int id;
	private String name;
	private String dept;
	private String designation;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String dept, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept, designation, id, name);
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
		Employee other = (Employee) obj;
		return Objects.equals(dept, other.dept) && Objects.equals(designation, other.designation) && id == other.id
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return id + " " + name + " " + dept + " " + designation;
	}
}

public class D06P10 {

	public static void main(String[] args) 
	{
	Hashtable<Integer,Employee> emp= new Hashtable<>();
	
	Employee e1 = new Employee(1001,"Daniel","Analyst","L&D");
	Employee e2 = new Employee(1002,"Thomas","Tester","Testing");
	Employee e3 = new Employee(1003,"Robert","Product Manager","Development");
	Employee e4 = new Employee(1004,"Grace","Tech Support","HR");
	
	emp.put(e1.getId(), e1);
	emp.put(e2.getId(), e2);
	emp.put(e3.getId(), e3);
	emp.put(e4.getId(), e4);
	
	System.out.println(emp.isEmpty());
}

}
