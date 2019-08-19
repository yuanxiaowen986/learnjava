/**
 * 稿费收入税率是20%
 * 
 */
public class RoyaltyIncome implements Income {
	// TODO
	public double income;

	public RoyaltyIncome(double income) {
		this.income = income;
	}

	@Override
	public double getTax() {
		return income * 0.2; // 税率20%
	}

}
