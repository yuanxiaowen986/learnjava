package com.itranswarp.world;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Students {
	List<Student> list;
	Map<String, Integer> cache;

	Students(List<Student> list) {
		this.list = list;
		cache = new HashMap<String, Integer>();
	}

	/**
	 * 根据name查找score，找到返回score，未找到返回-1
	 */
	int getScore(String name) {
		// 先在Map中查找:
		Integer score = this.cache.get(name);
		if (score == null) {
			// TODO:如果在cache找不到，则加入到cache中，再获取score
			this.cache.put(name, findInList(name));
			score = this.cache.get(name);
		}
		return score == null ? -1 : score.intValue();
	}

	Integer findInList(String name) {
		for (Student ss : this.list) {
			if (ss.name.equals(name)) {
				return ss.score;
			}
		}
		return null;
	}
}
