package com.itranswarp.world;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

/**
 * 请利用InputStream和OutputStream，编写一个复制文件的程序，它可以带参数运行： java
 * OutputStreamExample.java source.txt copy.txt
 * 
 * @author hadoop
 * 
 */
public class OutputStreamExample {
	public static void main(String[] args) throws IOException {
		/*
		 * if (args.length != 2) { System.err
		 * .println("Usage:\n  java CopyFile.java <source> <target>");
		 * System.exit(1); }
		 */
		copy("/usr/local/eclipse/eclipse_workspace/HelloWorld/src/source.txt",
				"copy.txt");
	}

	static void copy(String source, String target) throws IOException {
		// 友情提示：测试时请使用无关紧要的文件
		// TODO:定义InputStream读取source文件输入内存—》定义OutputStream输出已读取的Byte[]到target（记得关闭输入输出流）
		InputStream input = null;
		OutputStream output = null;
		int n;
		byte[] b = null;
		try {
			input = new FileInputStream(source);
			output = new FileOutputStream(target);
			b = new byte[68];
			// input.read(b)返回int,代表读取字节个数,另会将读取的字节内容存储到b字节数组中。因为一次性读取多个字节到byte[]中，效率更高。
			while ((n = input.read(b)) != -1) {
				System.out.println("read:" + n + "bytes");
			}
			output.write(b);
		} finally {
			if (input != null) {
				input.close();
			}
			if (output != null) {
				input.close();
			}
		}
	}

}
