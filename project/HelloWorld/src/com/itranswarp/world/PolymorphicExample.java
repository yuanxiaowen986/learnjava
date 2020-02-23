package com.itranswarp.world;

/**
 * 多态/抽象类/接口
 * 
 * @author Administrator
 * 
 */
public class PolymorphicExample {
	public static void main(String[] args) {
		// TODO: 给一个有工资收入和稿费收入的小伙伴算税:
		Income[] incomes = new Income[] { new SalaryIncome(7500),
				new RoyaltyIncome(12000) };
		double total = 0;
		// TODO:
		total = totalTax(incomes);
		System.out.println(total);
	}

	public static double totalTax(Income... incomes) {
		double total = 0;
		for (Income income : incomes) {
			total = total + income.getTax();
		}
		return total;
	}

}
