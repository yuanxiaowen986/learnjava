package com.itranswarp.world;

import java.util.Scanner;

/**
 * switch实现石头/剪子/布并判断胜负
 */
public class SwitchExample {

	public static void main(String[] args) {
		System.out.println("please choice:");
		System.out.println(" 1: Rock");
		System.out.println(" 2: Scissors");
		System.out.println(" 3: Paper");
		// 用户输入:
		Scanner scanner = new Scanner(System.in);
		System.out.println("your chooice : ");
		int choice = scanner.nextInt();
		// 计算机随机数 1, 2, 3:
		int random = 1 + (int) Math.random() * 3;
		System.out.println(random);
		switch (choice) {
		// TODO:
		case 1:
			System.out.println("your choice is Rock");
			switch (random) {
			case 1:
				System.out.println("computer choice is Rock");
				System.out.println("result: draw");
				break;
			case 2:
				System.out.println("computer choice is Scissors");
				System.out.println("result: win");
				break;
			case 3:
				System.out.println("computer choice is Paper");
				System.out.println("result: lose");
				break;
			}
			break;
		case 2:
			System.out.println("your choice is Scissors");
			switch (random) {
			case 1:
				System.out.println("computer choice is Rock");
				System.out.println("result: lose");
				break;
			case 2:
				System.out.println("computer choice is Scissors");
				System.out.println("result: draw");
				break;
			case 3:
				System.out.println("computer choice is Paper");
				System.out.println("result: win");
				break;
			}
			break;
		case 3:
			System.out.println("your choice is Paper");
			switch (random) {
			case 1:
				System.out.println("computer choice is Rock");
				System.out.println("result: win");
				break;
			case 2:
				System.out.println("computer choice is Scissors");
				System.out.println("result: lose");
				break;
			case 3:
				System.out.println("computer choice is Paper");
				System.out.println("result: draw");
				break;
			}
			break;
		default:
			System.out.println("error choice.");
			break;
		}
	}

}
