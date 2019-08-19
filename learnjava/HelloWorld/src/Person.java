/**
 * 给Person增加构造方法; 给Person增加重载方法setName(String, String)
 * 
 * 给Person类增加一个静态字段count和静态方法getCount，统计实例的个数
 * 
 * @author administrator
 */
public class Person {
	private String name;
	private int age;
	public static int count;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
		count++;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String prename, String lastname) {
		this.name = prename + " " + lastname;
	}

	public static int getCount() {
		return count;
	}
}