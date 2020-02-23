package com.itranswarp.world;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * InputStream
 * 
 * @author hadoop
 * 
 */
public class InputStreamExample {
	public static void main(String[] args) throws IOException {
		byte[] data = { 72, 101, 108, 108, 111, 33 };
		InputStream input = null;
		try {
			input = new ByteArrayInputStream(data);
			String s = readAsString(input);
			System.out.println(s);
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}

	public static String readAsString(InputStream input) throws IOException {
		int n;
		StringBuilder sb = new StringBuilder();
		while ((n = input.read()) != -1) {
			sb.append((char) n);
		}
		return sb.toString();
	}

}
