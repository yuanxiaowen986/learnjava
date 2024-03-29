package com.itranswarp.world;

/**
 * Student
 * 
 * @author yuanxiaowen
 * 
 */

public class Student extends Person {
	protected int score;

	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public int getScore() {
		return score;
	}
}