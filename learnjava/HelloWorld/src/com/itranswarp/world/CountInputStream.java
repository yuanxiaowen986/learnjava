package com.itranswarp.world;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.IOException;

/**
 * 编写一个CountInputStream，它的作用是对输入的字节进行计数：
 * 
 * @author hadoop
 * 
 */
public class CountInputStream extends FilterInputStream {
	private int count = 0;

	CountInputStream(InputStream in) {
		super(in);
	}

	public int getBytesRead() {
		return this.count;
	}

	public int read() throws IOException {
		int n = in.read();
		if (n != -1) {
			this.count++;
		}
		return n;
	}

	public int read(byte[] b, int off, int len) throws IOException {
		int n = in.read(b, off, len);
		this.count += n;
		return n;
	}
}
