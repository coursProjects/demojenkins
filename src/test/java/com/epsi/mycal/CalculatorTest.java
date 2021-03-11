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

}
