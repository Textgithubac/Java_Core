package com.Day01;

public class TestClass {
	 public static void main(String[] args) {
	        MedicineInfo tablet = new Tablet();
	        MedicineInfo syrup = new Syrup();
	        MedicineInfo ointment = new Ointment();
	        
	        // Check polymorphic behavior of displayLabel()
	        tablet.displayLabel();
	        syrup.displayLabel();
	        ointment.displayLabel();
	    }

}
