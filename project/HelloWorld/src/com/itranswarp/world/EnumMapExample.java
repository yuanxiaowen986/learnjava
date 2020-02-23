package com.itranswarp.world;

import java.util.Map;
import java.util.EnumMap;

/**
 * 使用EnumMap
 * 
 * @author hadoop
 * 
 */

public class EnumMapExample {
	public static void main(String[] args) {
		Map<DayofWeek, String> map = new EnumMap<DayofWeek, String>(
				DayofWeek.class);
		map.put(DayofWeek.MONDAY, "星期一");
		map.put(DayofWeek.TUESDAY, "星期二");
		map.put(DayofWeek.WEDNESDAY, "星期三");
		map.put(DayofWeek.THURSDAY, "星期四");
		map.put(DayofWeek.FRIDAY, "星期五");
		map.put(DayofWeek.SATURDAY, "星期六");
		map.put(DayofWeek.SUNDAY, "星期天");
		System.out.println(map.get(DayofWeek.MONDAY));
		System.out.println(map.get(DayofWeek.FRIDAY));
	}

}
