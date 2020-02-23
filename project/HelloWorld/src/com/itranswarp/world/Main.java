package com.itranswarp.world;

import java.util.concurrent.*;

/**
 * 测试专用
 * 
 * @author hadoop
 * 
 */

public class Main {
	public static void main(String[] args) {
		// 创建一个固定大小的线程池:
		ExecutorService es = Executors.newFixedThreadPool(4);
		for (int i = 0; i < 6; i++) {
			es.submit(new Task("" + i));
		}
		// 关闭线程池:
		es.shutdown();
		
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(4);
	}
}

