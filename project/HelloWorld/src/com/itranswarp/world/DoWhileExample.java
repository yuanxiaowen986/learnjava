package com.itranswarp.world;

/**
 * 
 * do while练习
 * 
 */

public class DoWhileExample {
	public static void main(String[] args) {
		int sum = 0;
		int m = 20;
		int n = 100;
		// FIXME: 使用do while计算M+...+N:
		do {
			sum = sum + m;
			m++;
		} while (m <= n);
		System.out.println(sum);
	}
}