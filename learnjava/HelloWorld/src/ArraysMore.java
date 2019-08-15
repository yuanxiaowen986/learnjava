import java.util.Arrays;

/**
 * 二维数组
 */
public class ArraysMore {
	public static void main(String[] args) {
		// 用二维数组表示的学生成绩:
		int[][] scores = { { 82, 90, 91 }, { 68, 72, 64 }, { 95, 91, 89 },
				{ 67, 52, 60 }, { 79, 81, 85 }, };
		// TODO:
		System.out.println(Arrays.deepToString(scores));
		double average = 0;
		int len = 0;
		int sum = 0;

		for (int[] ns : scores) {
			len += ns.length;
			for (int n : ns) {
				sum += n;
			}
		}

		average = (double) sum / len;
		System.out.println("average: " + average);
		if (Math.abs(average - 77.733333) < 0.000001) {
			System.out.println("测试成功");
		} else {
			System.out.println("测试失败");
		}
	}
}