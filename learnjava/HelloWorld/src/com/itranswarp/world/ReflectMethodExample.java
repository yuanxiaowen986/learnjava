package com.itranswarp.world;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import java.lang.reflect.Method;

/**
 * reflect-method example
 * 
 * @author Administrator
 * 
 */
public class ReflectMethodExample {
	static final Log log = LogFactory.getLog(ReflectMethodExample.class);

	public static void main(String[] args) throws Exception {
		log.info("process start!");
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射调用setName和setAge方法:
		Method m1 = Person.class.getMethod("setName", String.class);
		Method m2 = Person.class.getMethod("setAge", int.class);
		m1.invoke(p, name);
		m2.invoke(p, age);

		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
		log.info("process end!");
	}
}
