package com.itranswarp.world;

/**
 * 获取继承关系
 * 
 * @author Administrator
 * 
 */
public class SuperClassExample {
	public static void main(String[] args) throws Exception {
		Class i = Integer.class;
		Class n = i.getSuperclass();
		System.out.println(n);
		Class o = n.getSuperclass();
		System.out.println(o);
		System.out.println(o.getSuperclass());
	}
}
