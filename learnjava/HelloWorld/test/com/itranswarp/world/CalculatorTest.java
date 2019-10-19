package com.itranswarp.world;

import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
	Calculator calculator;

	@Before
	public void setUp() {
		this.calculator = new Calculator();
	}

	@After
	public void tearDown() {
		this.calculator = null;
	}

	@Test
	public void testAdd() {
		assertEquals(100, this.calculator.add(100));
		assertEquals(150, this.calculator.add(50));
		assertEquals(130, this.calculator.add(-20));
	}

	@Test
	public void testSub() {
		assertEquals(-100, this.calculator.sub(100));
		assertEquals(-150, this.calculator.sub(50));
		assertEquals(-130, this.calculator.sub(-20));
	}
}
