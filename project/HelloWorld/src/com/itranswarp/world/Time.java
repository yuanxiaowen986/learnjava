package com.itranswarp.world;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Time {

	/**
	 * 从"21:05:19"中提取时，分，秒，否则抛出IllegalArgumentException
	 */
	public static int[] parseTime(String s) {
		String regex = "([0-1][0-9]|2[0-4]):([0-6][0-9]):([0-6][0-9])";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		if (matcher.matches()) {
			int[] i = new int[3];
			i[0] = Integer.parseInt(matcher.group(1));
			i[1] = Integer.parseInt(matcher.group(2));
			i[2] = Integer.parseInt(matcher.group(3));
			return i;
		} else {
			throw new IllegalArgumentException();
		}
	}

}
