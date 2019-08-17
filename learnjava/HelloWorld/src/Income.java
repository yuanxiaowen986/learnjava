/**
 * 收入,定义抽象类Income
 * 
 * @author Administrator
 * 
 */
public abstract class Income {

	protected double income;

	public Income(double income) {
		this.income = income;
	}

	public abstract double getTax();

}
