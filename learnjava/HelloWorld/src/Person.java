/**
 * 给Person增加构造方法; 给Person增加重载方法setName(String, String)
 * 
 * @author yuanxiaowen
 */
public class Person {
	private String name;
	private int age;

	public Person() {

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
}