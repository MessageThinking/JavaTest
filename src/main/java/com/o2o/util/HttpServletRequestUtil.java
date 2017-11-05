package com.o2o.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 作者：wanwei
 * @version 创建时间：2017年11月4日 下午7:52:31 类说明
 */
public class HttpServletRequestUtil {
	/**
	 * 转换成int类型
	 * 
	 * @param request
	 * @param key
	 * @return
	 */
	public static int getInt(HttpServletRequest request, String key) {
		try {
			return Integer.decode(request.getParameter(key));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			return -1;
		}
	}

	/**
	 * 转换成Long类型
	 */
	public static Long getLong(HttpServletRequest request, String key) {
		try {
			return Long.decode(request.getParameter(key));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			return -1L;
		}
	}

	/**
	 * 转换成Double类型
	 */
	public static Double getDouble(HttpServletRequest request, String key) {
		try {
			return Double.valueOf(request.getParameter(key));
		} catch (Exception e) {
			return -1d;
		}
	}

	/**
	 * 转换成boolean类型
	 */
	public static boolean getBoolean(HttpServletRequest request, String key) {
		try {
			return Boolean.valueOf(request.getParameter(key));
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 转换成String类型
	 */
	public static String getString(HttpServletRequest request, String key) {
		String msg = request.getParameter(key);
		try {
			if (msg != null) {
				msg = msg.trim();
			}
			if ("".equals(msg)) {
				msg = null;
			}
			return msg;
		} catch (Exception e) {
			return null;
		}
	}
}
