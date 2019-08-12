/**
 * 
 * while练习
 */

public class WhileExample {

	public static void main(String[] args) {
		int sum = 0;
		int m = 20;
		int n = 100;
		// FIXME: 使用while计算M+...+N:
		while (m <= n) {
			sum = sum + m;
			m++;
		}
		System.out.println(sum);
		int i = ((20 + 100) * 81) / 2; // 数列公式：((1+n)*n)/2。
		System.out.println(i);
	}
}