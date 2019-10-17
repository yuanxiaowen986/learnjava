package com.itranswarp.world;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 编写JUint测试：阶乘
 * 
 * @author Administrator
 * 
 */
public class FactorialTest {

	@Test
	public void testFact() {
		assertEquals(2L, Factorial.fact(2));
		assertEquals(6L, Factorial.fact(3));
	}

}
