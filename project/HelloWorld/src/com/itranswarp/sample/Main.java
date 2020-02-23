package com.itranswarp.sample;

/**
 * 可以用来自动创建文档的注释
 * 
 * 计算前N个自然数的和
 * 
 * @author yuanxiaowen
 */
public class Main {
	public static void main(String[] args) {
		int n = 100;
		// TODO: sum = 1 + 2 + ... + n
		int sum = ((1 + n) * n) / 2;

		System.out.println(sum);
		System.out.println(sum == 5050 ? "测试通过" : "测试失败");
	}
}