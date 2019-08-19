/**
 * 工资收入
 * 
 * @author Administrator
 * 
 */
public class SalaryIncome implements Income {
	public double income;

	public SalaryIncome(double income) {
		this.income = income;
	}

	@Override
	public double getTax() {
		if (income <= 5000) {
			return 0;
		}
		return (income - 5000) * 0.2;
	}
}
