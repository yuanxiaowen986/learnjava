/**
 * 
 * for each循环对数组每个元素求和
 */
public class ForExampleTwo {
	public static void main(String[] args) {
		int[] ns = { 1, 4, 9, 16, 25 };
		int sum = 0;
		for (int n : ns) {
			sum = sum + n;
		}
		System.out.println(sum); // 55
	}
}