package com.itranswarp.world;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 对一个BigDecimal设置它的scale， 如果精度比原始值低，那么按照指定的方法进行四舍五入或者直接截断
 * 
 * @author Administrator
 * 
 */
public class BigDecimalExample {
	public static void main(String[] args) {
		BigDecimal d1 = new BigDecimal("123.456789");
		BigDecimal d2 = d1.setScale(4, RoundingMode.HALF_UP); // 四舍五入，123.4568
		BigDecimal d3 = d1.setScale(4, RoundingMode.DOWN); // 直接截断，123.4567
		System.out.println(d2);
		System.out.println(d3);
	}
}