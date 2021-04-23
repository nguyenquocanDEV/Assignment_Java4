package com.poly.common;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookiesUtils {

    // lấy giá trị cookies
    public static String get(String name, HttpServletRequest re) {
	Cookie[] cookies = re.getCookies();
	if (cookies != null) {
	    for (Cookie cookie : cookies) {
		if (cookie.getName().equals(name)) {
		    return cookie.getValue();
		}
	    }
	}
	return null;
    }
    // thêm mới cookie
    public static Cookie add(String name, String value, int hours, HttpServletResponse rep) {
	Cookie cookie = new Cookie(name, value);
	cookie.setMaxAge(60*60*hours);
	cookie.setPath("/");
	rep.addCookie(cookie);
	return cookie;
    }

}
