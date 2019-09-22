package com.itranswarp.world;

/**
 * 测试专用
 * 
 * @author hadoop
 * 
 */
public class Test {
	public static void main(String[] args) {
		String s = "190";
		int i = (int) (s.charAt(2));
		Integer it = Integer.valueOf(s);
		int i2 = it.intValue();
		char i3 = s.charAt(2);
		Integer it2 = Integer.valueOf(i3);
		int i4 = it2.intValue();
		System.out.println(i);
		System.out.println(it);
		System.out.println(i2);
		System.out.println(it2);
		System.out.println(i4);
	}

}
