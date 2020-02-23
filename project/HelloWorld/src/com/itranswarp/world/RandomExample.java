package com.itranswarp.world;

import java.util.Random;

/**
 * 如果我们在创建Random实例时指定一个种子，就会得到完全确定的随机数序列
 * 
 * @author Administrator
 * 
 */
public class RandomExample {
	public static void main(String args[]) {
		Random r = new Random(12345);
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(100));
		}
	}

}
