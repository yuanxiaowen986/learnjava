package com.itranswarp.world;

import java.util.List;
import java.util.ArrayList;

/**
 * 使用Map
 * 
 * @author hadoop
 * 
 */
public class MapExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Bob", 78));
		list.add(new Student("Alice", 85));
		list.add(new Student("Brush", 66));
		list.add(new Student("Newton", 99));
		Students holder = new Students(list);
		System.out.println(holder.getScore("Bob") == 78 ? "测试成功!" : "测试失败!");
		System.out.println(holder.getScore("Alice") == 85 ? "测试成功!" : "测试失败!");
		System.out.println(holder.getScore("Tom") == -1 ? "测试成功!" : "测试失败!");
	}
}
