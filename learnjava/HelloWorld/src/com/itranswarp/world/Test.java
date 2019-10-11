package com.itranswarp.world;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 测试专用
 * 
 * @author hadoop
 * 
 */
public class Test {
	public static void main(String[] args) {
		// 当前时间:
		Calendar c = Calendar.getInstance();
		// 清除所有:
		c.clear();
		// 设置年月日时分秒:
		c.set(2019, 10 /* 11月 */, 20, 8, 15, 0);
		// 加5天并减去2小时:
		c.add(Calendar.DAY_OF_MONTH, 5);
		c.add(Calendar.HOUR_OF_DAY, -2);
		// 显示时间:
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = c.getTime();
		System.out.println(sdf.format(d));
		// 2019-11-25 6:15:00
	}

}
