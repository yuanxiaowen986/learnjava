package com.itranswarp.world;

/**
 * 
 * 布尔运算、三目运算 短路运算
 * 
 * @author yuanxiaowen
 */
public class BooleanExample {

	public static void main(String[] args) {
		int age = 7;
		// primary student的定义: 6~12岁
		boolean isPrimaryStudent = age >= 6 && age <= 12;
		System.out.println(isPrimaryStudent ? "Yes" : "No");

	}

}
