package com.learning.core.Day6;
import java.util.Hashtable;
import java.util.Map;
class Employee9 {
	    private int id;
	    private String name;
	    private String department;
	    private String designation;

	    public Employee9(int id, String name, String department, String designation) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.designation = designation;
	    }

	    @Override
	    public String toString() {
	        return id + " " + name + " " + designation + " " + department;
	    }

	    @Override
	    public int hashCode() {
	        return id;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
				return true;
			}
	        if (obj == null || getClass() != obj.getClass()) {
				return false;
			}

	        Employee9 employee3 = (Employee9) obj;
	        return id == employee3.id;
	    }
	}
public class D06P14 {
	public static void main(String[] args) {
        Map<Integer, Employee9> employeeHashTable = new Hashtable<>();

        // Creating Employee instances
        Employee9 employee1 = new Employee9(1006, "Henry", "Finance", "Accountant");
        Employee9 employee2 = new Employee9(1005, "Charles", "Testing", "Q&A Lead");
        Employee9 employee3 = new Employee9(1004, "Grace", "HR", "Tech Support");
        Employee9 employee4 = new Employee9(1003, "Robert", "Development", "Product Manager");

        // Adding employees to the HashTable
        employeeHashTable.put(employee1.hashCode(), employee1);
        employeeHashTable.put(employee2.hashCode(), employee2);
        employeeHashTable.put(employee3.hashCode(), employee3);
        employeeHashTable.put(employee4.hashCode(), employee4);

        // Creating a new Collection with additional data
        Map<Integer, Employee9> additionalEmployeeData = new Hashtable<>();
        Employee9 employee5 = new Employee9(1002, "Thomas", "Testing", "Tester");
        Employee9 employee6 = new Employee9(1001, "Daniel", "L&D", "Analyst");

        // Adding new employees to the additional collection
        additionalEmployeeData.put(employee5.hashCode(), employee5);
        additionalEmployeeData.put(employee6.hashCode(), employee6);

        // Adding employees from the additional collection to the main HashTable
        employeeHashTable.putAll(additionalEmployeeData);

        // Displaying the employee details
        employeeHashTable.values().forEach(System.out::println);
    }

}
