package com.itranswarp.world;

/**
 * 定义PrimaryStudent，从Student继承，新增grade字段:
 * 
 * @author yuanxiaowen
 * 
 */

public class ExtendsExample {
	public static void main(String[] args) {
		Person p = new Person("小明", 12);
		Student s = new Student("小红", 20, 99);
		// TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
		Student ps = new PrimaryStudent("小军", 9, 100, 5);
		System.out.println(p.getName());
		System.out.println(s.getName());
		System.out.println("name:" + ps.getName() + ";" + "score:"
				+ ps.getScore());
		System.out.println("name:" + ps.getName() + ";" + "grade:"
				+ ((PrimaryStudent) ps).getGrade());
	}
}