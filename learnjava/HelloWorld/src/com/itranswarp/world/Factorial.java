package com.itranswarp.world;

/**
 * 编写JUint测试：阶乘
 * 
 * @author Administrator
 * 
 */
public class Factorial {

	public static long fact(long n) {
		long r = 1;
		for (long i = 1; i <= n; i++) {
			r = r * i;
		}
		return r;
	}

}
