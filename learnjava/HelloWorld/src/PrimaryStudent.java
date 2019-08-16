/**
 * 定义PrimaryStudent，从Student继承，新增grade字段:
 * 
 * @author yuanxiaowen
 * 
 */
public class PrimaryStudent extends Student {
	// TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
	protected int grade;

	public PrimaryStudent(String name, int age, int score, int grade) {
		super(name, age, score);
		this.grade = grade;
	}

	public int getGrade() {
		return this.grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}