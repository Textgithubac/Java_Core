package com.learning.core.Day10;
import org.junit.Assert;
import org.junit.Test;
public class D10P08 {
	public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
    @Test
    public void testMul() {
        D10P08 calculator = new D10P08();
        int result = calculator.mul(2, 3);
        Assert.assertEquals(6, result); 
    }

    @Test
    public void testDiv() {
        D10P08 calculator = new D10P08();
        int result = calculator.div(6, 3);
        Assert.assertEquals(2, result); 
    }
    

}
