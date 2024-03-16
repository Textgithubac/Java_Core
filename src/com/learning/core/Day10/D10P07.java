package com.learning.core.Day10;

import org.junit.Assert;
import org.junit.Test;
public class D10P07 {
	public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    @Test
    public void testAddition() {
        D10P07 calculator = new D10P07();
        int result = calculator.add(2, 3);
        Assert.assertEquals(5, result); 
    }

    @Test
    public void testSubstraction() {
        D10P07 calculator = new D10P07();
        int result = calculator.sub(6, 3);
        Assert.assertEquals(3, result); 
    }
		
	
}


