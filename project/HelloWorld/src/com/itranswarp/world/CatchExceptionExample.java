package com.itranswarp.world;

/**
 * 捕获异常
 * 
 * @author Administrator
 * 
 */
public class CatchExceptionExample {
	public static void main(String[] args) {
		String a = "12";
		String b = "x9";
		// TODO: 捕获异常并处理
		int c = stringToInt(a);
		int d = stringToInt(b);
		System.out.println(c * d);
	}

	static int stringToInt(String s) {
		try {
			return Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println("字符串" + s + ":非全数字，不能转换为整型。");
			// e.printStackTrace();
			return 0;
		}
	}
}
