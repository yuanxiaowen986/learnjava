package com.itranswarp.world;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 编写一个简单的模板引擎，利用正则表达式实现这个功能。
 * 
 * @author Administrator
 * 
 */
public class Template {

	final String template;
	final Pattern pattern = Pattern.compile("\\$\\{(\\w+)\\}");

	public Template(String template) {
		this.template = template;
	}

	public String render(Map<String, String> data) {
		Matcher m = pattern.matcher(template);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			for (String key : data.keySet()) {
				if (("${" + key + "}").equals(template.substring(m.start(),
						m.end()))) {
					m.appendReplacement(sb, data.get(key));
					break;
				}
			}
		}
		m.appendTail(sb);
		return sb.toString();
	}

}