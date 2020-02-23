package com.itranswarp.world;

import java.util.List;
import java.util.ArrayList;

/**
 * 编写equals方法
 * 
 * @author hadoop
 * 
 */
public class ListEqualsExample {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Xiao", "Ming", 18));
		list.add(new Person("Xiao", "Hong", 25));
		list.add(new Person("Bob", "Smith", 20));
		boolean exist = list.contains(new Person("Bob", "Smith", 20));
		System.out.println(exist ? "测试成功!" : "测试失败!");
	}
}
