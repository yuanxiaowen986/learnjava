package com.itranswarp.world;

import java.io.IOException;
import java.io.ByteArrayInputStream;

/**
 * Filter模式
 * 
 * @author hadoop
 * 
 */
public class FilterExample {
	public static void main(String[] args) throws IOException {
		byte[] data = "hello, world!".getBytes("UTF-8");
		CountInputStream input = null;
		try {
			int n;
			input = new CountInputStream(new ByteArrayInputStream(data));
			while ((n = input.read()) != -1) {
				System.out.println((char) n);
			}
			System.out.println("Total read " + input.getBytesRead() + " bytes");
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}
}
