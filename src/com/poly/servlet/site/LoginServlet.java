package com.poly.servlet.site;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.poly.common.CookiesUtils;
import com.poly.common.PageInfo;
import com.poly.common.PageType;
import com.poly.common.SessionUtils;
import com.poly.dao.UserDAO;
import com.poly.domain.LoginForm;
import com.poly.model.User;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	String username = CookiesUtils.get("id", request);
	if (username == null) {
	    PageInfo.prepareAndForwardSite(request, response, PageType.SITE_LOGIN_PAGE);
	    return;
	}
	SessionUtils.add(request, "id", username);

	PageInfo.prepareAndForwardSite(request, response, PageType.SITE_HOME_PAGE);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	try {
	    LoginForm form = new LoginForm();
	    BeanUtils.populate(form, request.getParameterMap());
	    UserDAO dao = new UserDAO();
	    User user = dao.findId(form.getId());
	    if (user != null && user.getPassword().equals(form.getPassword())) {
		SessionUtils.add(request, "id", user.getId());
		if (form.isRememberme()) {
		    CookiesUtils.add("id", form.getId(), 24, response);
		    CookiesUtils.add("password", form.getId(), 24, response);
		} else {
		    CookiesUtils.add("id", form.getId(), 0, response);
		    CookiesUtils.add("password", form.getId(), 0, response);
		}
		request.setAttribute("name", user.getFullName());
		request.setAttribute("isLogin", true);
		PageInfo.prepareAndForwardSite(request, response, PageType.SITE_HOME_PAGE);

	    } else {
		request.setAttribute("error", "Invalid username or password ");
	    }
	} catch (Exception e) {
	    request.setAttribute("error", e.getMessage());
	}
	PageInfo.prepareAndForwardSite(request, response, PageType.SITE_LOGIN_PAGE);
    }

}
