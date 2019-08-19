package com.itranswarp.world;

/**
 * 可以用来自动创建文档的注释
 * 
 * 计算出一元二次方程的两个解
 * 
 * @author yuanxiaowen
 */
public class CalFloat {

	public static void main(String[] args) {
		double a = 1.0;
		double b = 3.0;
		double c = -4.0;

		// 求平方根可用 Math.sqrt():
		// System.out.println(Math.sqrt(2)); ==> 1.414
		// TODO:
		double r1 = 0;
		double r2 = 0;

		double b24ac = b * b - 4 * a * c;

		if (b24ac >= 0) {
			r1 = (-b + Math.sqrt(b24ac)) / 2 * a;
			r2 = (-b - Math.sqrt(b24ac)) / 2 * a;
			System.out.println("r1:" + r1);
			System.out.println("r2:" + r2);
			System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");

		} else {
			System.out.println("此方程无根");
		}

	}

}
