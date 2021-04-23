package com.poly.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionUtils {
    // add session
    public static void add(HttpServletRequest re, String name, Object value) {
	HttpSession session = re.getSession();
	session.setAttribute(name, value);
    }

    // get session
    public static Object get(HttpServletRequest re, String name) {
	HttpSession session = re.getSession();
	return session.getAttribute(name);
    }

    // cancel the session
    public static void invalidate(HttpServletRequest re) {
	HttpSession session = re.getSession();
	re.removeAttribute("id");
	session.invalidate();
    }

    // check login
    public static boolean isLogn(HttpServletRequest re) {
	return get(re, "id") != null;
    }

    // get login username
    public static String getLoginUsername(HttpServletRequest re) {
	Object username = get(re, "id");
	return username == null ? null : username.toString();
    }
    //get login password
    public static String getLoginPassword(HttpServletRequest re) {
	Object password = get(re, "password");
	return password == null ? null : password.toString();
    }
}
