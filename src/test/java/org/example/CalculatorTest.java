package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {
    @Test
    public void testAddMe() {
        Calculator calculator = new Calculator();
        int result1 = calculator.addMe(5, 3);
        assertEquals(8, result1);
    }
    @Test
    public void testProductMe() {
        Calculator calculator = new Calculator();
        int result2 = calculator.productMe(5, 3);
        assertEquals(15, result2);
    }
}