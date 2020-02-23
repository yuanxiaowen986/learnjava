package com.itranswarp.world;

import java.math.BigInteger;

/**
 * 如果BigInteger的值甚至超过了float的最大范围（3.4x1038）， 那么返回的float是什么呢？
 * 
 * @author Administrator
 * 
 */
public class BigIntegerExample {
	public static void main(String[] args) {
		BigInteger n = new BigInteger("999999").pow(99);
		float f = n.floatValue();
		System.out.println(f);
	}
}
