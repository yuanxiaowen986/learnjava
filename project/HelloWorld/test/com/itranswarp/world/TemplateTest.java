package com.itranswarp.world;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

public class TemplateTest {

	@Test
	public void testIsValidTel() {
		Template t = new Template("Hello, ${name}! You are learning ${lang}!");
		Map<String, String> data = new HashMap<String, String>();
		data.put("name", "Bob");
		data.put("lang", "Java");
		assertEquals("Hello, Bob! You are learning Java!", t.render(data));
	}
}
