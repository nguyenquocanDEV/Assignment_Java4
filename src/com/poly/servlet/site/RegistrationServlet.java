package com.poly.servlet.site;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.poly.common.PageInfo;
import com.poly.common.PageType;
import com.poly.dao.UserDAO;
import com.poly.model.User;

@WebServlet("/Registration")
public class RegistrationServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	PageInfo.prepareAndForwardSite(request, response, PageType.SITE_REGISTRATION_PAGE);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	User users = new User();
	try {

	    BeanUtils.populate(users, request.getParameterMap());
	    UserDAO dao = new UserDAO();
	    dao.create(users);

	    request.getRequestDispatcher("/Login").forward(request, response);

	} catch (Exception e) {
	    e.printStackTrace();
	    request.setAttribute("error", e.getMessage());
	}
	request.setAttribute("users", users);
	PageInfo.prepareAndForwardSite(request, response, PageType.SITE_REGISTRATION_PAGE);

    }

}
