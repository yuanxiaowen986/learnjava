package com.itranswarp.world;

import java.util.Arrays;

/**
 * 使用泛型，泛型接口
 * 
 * @author Administrator
 * 
 */
public class TExample {
	public static void main(String[] args) {
		Person[] ps = new Person[] { new Person("Bob", 61),
				new Person("Alice", 88), new Person("Lily", 75), };
		Arrays.sort(ps);
		System.out.println(Arrays.toString(ps));
	}
}