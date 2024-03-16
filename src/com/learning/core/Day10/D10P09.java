package com.learning.core.Day10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class Calculator{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a / b;
	}
	 public int findMax(int[] arr) {
	      int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }
}

public class D10P09 {
	Calculator calculator = new Calculator();
	@Test
	public void testAddition() {
		assertEquals(150, calculator.add(50, 100));
	}
	
	@Test
	public void testSubstract() {
		assertEquals(50, calculator.sub(50, 100));
	}
	@Test
    public void testMultiply() {
        assertEquals(100, calculator.mul(10, 10));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.div(10, 5));
    }

    @Test
    public void testFindMax() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        assertEquals(6, calculator.findMax(arr));
    }

    @Test
    public void testFindMax2() {
        int[] arr = {-1, -1, -2, -3, -4, -5};
        assertEquals(-1, calculator.findMax(arr));
    }

    
	
}
