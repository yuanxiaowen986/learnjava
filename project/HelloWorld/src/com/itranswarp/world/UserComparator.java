package com.itranswarp.world;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
	public int compare(User u1, User u2) {
		if (u1.number.charAt(0) == u2.number.charAt(0)) {
			// 如果两人的号都是A开头或者都是V开头,比较号的大小:
			// return u1.number.compareTo(u2.number);

			int n1 = Integer.parseInt(u1.number.substring(1));
			int n2 = Integer.parseInt(u2.number.substring(1));
			return n1 > n2 ? 1 : -1;
		}
		if (u1.number.charAt(0) == 'V') {
			// u1的号码是V开头,优先级高:
			return -1;
		} else {
			return 1;
		}
	}
}
