package com.itranswarp.world;

/**
 * 从BaseException派生自定义异常
 * 
 * @author hadoop
 * 
 */
public class CustomExceptionExample {
	public static void main(String[] args) {
		try {
			String s1 = login("admin", "password");
			System.out.println("s1:" + s1);
			String s2 = login("admin", "pass");
			System.out.println("s2:" + s2);
			String s3 = login("adm", "password");
			System.out.println("s3:" + s3);
		} catch (LoginFailException e) {
			e.printStackTrace();
		} catch (UserNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("测试结束！");
		}
	}

	static String login(String username, String password) {
		if ("admin".equals(username)) {
			if ("password".equals(password)) {
				return "登陆成功";
			} else {
				throw new LoginFailException("请输入正确的密码!");
			}
		} else {
			throw new UserNotFoundException("该用户不存在！");
		}
	}
}

class BaseException extends RuntimeException {
	public BaseException() {
		super();
	}

	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseException(String message) {
		super(message);
	}

	public BaseException(Throwable cause) {
		super(cause);
	}
}

class LoginFailException extends BaseException {
	public LoginFailException() {
		super();
	}

	public LoginFailException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoginFailException(String message) {
		super(message);
	}

	public LoginFailException(Throwable cause) {
		super(cause);
	}
}

class UserNotFoundException extends BaseException {
	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserNotFoundException(String message) {
		super(message);
	}

	public UserNotFoundException(Throwable cause) {
		super(cause);
	}
}
