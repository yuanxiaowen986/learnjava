/**
 * 
 * for循环计算π
 */

public class ForExampleThree {
	public static void main(String[] args) {
		double pi = 0;
		for (int i = 1, j = 0; i < 100000; i += 2, j += 1) {
			pi += (1.0 / i) * Math.pow(-1, j);
		}
		pi = 4 * pi;
		System.out.println(pi);
	}
}