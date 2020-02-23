package com.itranswarp.world;

import java.util.Scanner;

/**
 * 
 * 输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）
 */

public class InputOutput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // 创建Scanner对象
		System.out.print("输入上次考试成绩: "); // 打印提示
		int prev = scanner.nextInt();
		// 读取一行输入并获取整数
		System.out.print("输入本次考试成绩: "); // 打印提示
		int score = scanner.nextInt();

		double percent = ((double) (score - prev)) / prev;

		System.out.printf("成绩提高了%.2f%%", percent * 100);

	}

}