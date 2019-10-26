package com.itranswarp.world;

/**
 * 匹配规则练习
 * 
 * @author Administrator
 * 
 */
public class RegexTel {

	/**
	 * 功能：测试字符串是否是一个有效的"3~4位区号-7~8位电话"
	 * 
	 * @param tel 输入一个String类型电话号码
	 *            
	 * 
	 */
	public static boolean isValidTel(String tel) {
		String regex = "\\d{3,4}-\\d{7,8}";
		return tel.matches(regex);
	}

}
