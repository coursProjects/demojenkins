package com.epsi.mycal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdd() {

        int a = 2;
        int b = 3;

        Calculator calc = new Calculator();
        int actual = calc.add(a, b);
        assertEquals(actual, 5);
    }

    @Test
    public void testSub() {

        int a = 2;
        int b = 3;

        Calculator calc = new Calculator();
        int actual = calc.sub(a, b);
        assertEquals(actual, -1);
    }

    @Test
    public void testMul() {

        int a = 2;
        int b = 3;

        Calculator calc = new Calculator();
        int actual = calc.mul(a, b);
        assertEquals(actual, 6);
    }


    @Test
    public void testDiv() {

        int a = 4;
        int b = 2;

        Calculator calc = new Calculator();
        double actual = calc.div(a, b);
        assertEquals(actual, 2, 0.05);
    }

    @Test
    public void testPair() {

        Calculator calc = new Calculator();
        assertTrue(calc.isPair(2));
        assertFalse(calc.isPair(3));
    }

    @Test
    public void testFirstDigit() {

        Calculator calc = new Calculator();
        assertTrue(calc.isFirstDigit(3));
        assertFalse(calc.isFirstDigit(4));
    }
}
