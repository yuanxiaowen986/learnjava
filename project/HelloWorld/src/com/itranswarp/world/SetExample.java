package com.itranswarp.world;

import java.util.*;

/**
 * 使用Set
 * 
 * @author hadoop
 * 
 */

public class SetExample {
	public static void main(String[] args) {
		List<Message> received = new ArrayList<Message>();
		received.add(new Message(1, "Hello!"));
		received.add(new Message(2, "发工资了吗？"));
		received.add(new Message(2, "发工资了吗？"));
		received.add(new Message(3, "去哪吃饭？"));
		received.add(new Message(3, "去哪吃饭？"));
		received.add(new Message(4, "Bye"));
		List<Message> displayMessages = process(received);
		for (Message message : displayMessages) {
			System.out.println(message.text);
		}
	}

	static List<Message> process(List<Message> received) {
		// TODO: 按sequence去除重复消息
		Set<Message> set = new HashSet<Message>();
		List<Message> newList = new ArrayList<Message>();
		for (Message m : received) {
			if (set.add(m)) {
				newList.add(m);
			}
		}
		return newList;
	}
}
