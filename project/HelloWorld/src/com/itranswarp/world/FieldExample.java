package com.itranswarp.world;

import java.lang.reflect.Field;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

/**
 * reflect-field练习
 * 
 * @author Administrator
 * 
 */
public class FieldExample {
	public static void main(String[] args) {
		Log log = LogFactory.getLog(FieldExample.class);
		log.info("process start");
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射给name和age字段赋值:
		try {
			Class cla = Person.class;
			Field f1 = cla.getDeclaredField("name");
			Field f2 = cla.getDeclaredField("age");
			f1.setAccessible(true);
			f2.setAccessible(true);
			f1.set(p, name);
			f2.set(p, age);
		} catch (NoSuchFieldException e) {
			log.error("error:", e);
		} catch (IllegalAccessException e) {
			log.error("error:", e);
		}
		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
		log.info("process end");
	}
}
