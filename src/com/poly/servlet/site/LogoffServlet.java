package com.poly.servlet.site;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poly.common.CookiesUtils;
import com.poly.common.PageInfo;
import com.poly.common.PageType;
import com.poly.common.SessionUtils;

@WebServlet("/Logoff")
public class LogoffServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	CookiesUtils.add("id", null, 0, response);
	SessionUtils.invalidate(request);
	request.setAttribute("isLogin", false);
	PageInfo.prepareAndForwardSite(request, response, PageType.SITE_LOGIN_PAGE);
    }

}
