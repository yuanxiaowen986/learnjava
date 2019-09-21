package com.itranswarp.world;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 使用PriorityQueue
 * 
 * @author hadoop
 * 
 */
public class PriorityQueueExample {
	public static void main(String[] args) {
		Queue<User> q = new PriorityQueue<User>(13, new UserComparator());
		// 添加3个元素到队列:
		q.offer(new User("Bob", "A2"));
		q.offer(new User("Alice", "A10"));
		q.offer(new User("Boss", "V1"));
		System.out.println(q.poll()); // Boss/V1
		System.out.println(q.poll()); // Bob/A1
		System.out.println(q.poll()); // Alice/A2
		System.out.println(q.poll()); // null,因为队列为空
	}
}
