package com.itranswarp.world;


/**
 * 测试专用
 * 
 * @author hadoop
 * 
 */
public class Test {
	public static void main(String[] args) {
		String regex = "20\\d\\d";
		System.out.println("2019".matches(regex));
		System.out.println("2109".matches(regex));
	}

}
