package com.itranswarp.world;

import java.util.Arrays;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;

public class SecureRandomExample {
	public static void main(String[] args) {
		SecureRandom sr = null;
		try {
			// sr = SecureRandom.getInstanceStrong(); // 获取高强度安全随机数生成器
			sr = SecureRandom.getInstance("12345");
		} catch (NoSuchAlgorithmException e) {
			sr = new SecureRandom(); // 获取普通的安全随机数生成器
		}
		byte[] buffer = new byte[16];
		sr.nextBytes(buffer); // 用安全随机数填充buffer
		System.out.println(Arrays.toString(buffer));
	}
}