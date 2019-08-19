package com.itranswarp.world;

import java.util.Scanner;

/**
 * 
 * 计算BMI
 */

public class IfExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Height (m): ");

		double height = scanner.nextDouble();

		System.out.print("Weight (kg): ");

		double weight = scanner.nextDouble();
		// FIXME:

		double bmi = weight / (height * height);
		// TODO: 打印BMI值及结果

		if (bmi < 18.5) {
			System.out.println("BMI:" + bmi + ",过轻");
		} else if (bmi <= 25) {
			System.out.println("BMI:" + bmi + ",正常");
		} else if (bmi <= 28) {
			System.out.println("BMI:" + bmi + ",过重");
		} else if (bmi <= 32) {
			System.out.println("BMI:" + bmi + ",肥胖");
		} else {
			System.out.println("BMI:" + bmi + ",非常肥胖");
		}
	}

}