package com.itranswarp.world;

/**
 * 面向对象基础
 */
public class ObjectBase {
	public static void main(String[] args) {
		City bj = new City();
		bj.name = "BeiJing";
		bj.latitude = 39.903;
		bj.longitude = 116.401;
		System.out.println(bj.name);
		System.out.println("location: " + bj.latitude + ", " + bj.longitude);
	}
}

/**
 * 定义class
 */
class City {
	public String name;
	public double latitude;
	public double longitude;
}