/**
 * 收入
 * 
 * @author Administrator
 * 
 */
public class Income {

	protected double income;

	public Income(double income) {
		this.income = income;
	}

	public double getTax() {
		return income * 0.1; // 税率10%
	}
}
