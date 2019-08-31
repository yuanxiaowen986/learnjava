package com.itranswarp.world;

/**
 * 抛出异常练习
 * 
 * @author hadoop
 * 
 */
public class ThrowExceptionExample {

	public static void main(String[] args) {
		try {
			System.out.println(tax(2000, 0.1));
			System.out.println(tax(-200, 0.1));
			System.out.println(tax(2000, -0.1));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} finally {
			System.out.println("end");
		}
	}

	static double tax(int salary, double rate) {
		// TODO: 如果传入的参数为负，则抛出IllegalArgumentException
		if (salary < 0 || rate < 0) {
			throw new IllegalArgumentException();
		} else {
			return salary * rate;
		}
	}
}
