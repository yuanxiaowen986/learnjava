package com.itranswarp.world;

import java.util.Objects;

/**
 * 给Person增加构造方法; 给Person增加重载方法setName(String, String)
 * 
 * 给Person类增加一个静态字段count和静态方法getCount，统计实例的个数
 * 
 * @author administrator
 */
public class Person implements Comparable<Person> {
	@Range(min = 1, max = 20)
	public String name;
	@Range(min = 1, max = 100)
	public int age;
	public static int count;
	@Range(max = 10)
	public String city;

	public String firstName;
	public char lastName;

	public Person(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public Person(String firstName, char lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

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

	@Override
	public String toString() {
		return String.format("{Person: name=%s, city=%s, age=%d}", name, city,
				age);
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Person) {
			Person p = (Person) o;
			return (Objects.equals(this.firstName, p.firstName)
					&& Objects.equals(this.lastName, p.lastName) && this.age == p.age);
		}
		return false;
	}
}