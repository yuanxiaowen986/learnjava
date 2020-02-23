package com.itranswarp.world;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import java.io.UnsupportedEncodingException;

/**
 * Commons Logging练习
 * 
 * @author Administrator
 * 
 */
public class CommonsLoggingExample {
	static final Log log = LogFactory.getLog(CommonsLoggingExample.class);

	public static void main(String[] args) {
		log.info("Start process...");
		try {
			"".getBytes("invalidCharsetName");
		} catch (UnsupportedEncodingException e) {
			// TODO: 使用log.error(String, Throwable)打印异常
			log.error("invalidCharsetName", e);
		}
		log.info("Process end.");
	}
}
