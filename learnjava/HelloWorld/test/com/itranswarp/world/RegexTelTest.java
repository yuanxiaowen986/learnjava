package com.itranswarp.world;

import static org.junit.Assert.*;
import org.junit.Test;

public class RegexTelTest {
	@Test
	public void testIsValidTel() {
		assertTrue(RegexTel.isValidTel("324-2434567"));
		assertTrue(RegexTel.isValidTel("324-24345678"));
		assertTrue(RegexTel.isValidTel("3244-2434567"));
		assertTrue(RegexTel.isValidTel("3241-24345671"));
		assertTrue(RegexTel.isValidTel("3244-0134767"));

		assertFalse(RegexTel.isValidTel("32441-0134767"));
		assertFalse(RegexTel.isValidTel("32-0134767"));
		assertFalse(RegexTel.isValidTel("3-0134767"));
		assertFalse(RegexTel.isValidTel("324-013476787"));
		assertFalse(RegexTel.isValidTel("3244&0134767"));
		assertFalse(RegexTel.isValidTel("324#0134767"));
		assertFalse(RegexTel.isValidTel("324-013476"));
		assertTrue(RegexTel.isValidTel("324-0134761"));

	}

}
