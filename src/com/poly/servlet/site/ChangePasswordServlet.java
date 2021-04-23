package com.poly.servlet.site;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.poly.common.PageInfo;
import com.poly.common.PageType;
import com.poly.common.SessionUtils;
import com.poly.dao.UserDAO;
import com.poly.domain.ChangePasswordForm;

@WebServlet("/ChangePass")
public class ChangePasswordServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	String username = SessionUtils.getLoginUsername(request);

	if (username == null) {
	    request.getRequestDispatcher("/Login").forward(request, response);
	    return;
	}

	request.setAttribute("username", username);

	PageInfo.prepareAndForwardSite(request, response, PageType.SITE_CHANGEPASS_PAGE);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	try {
	    String username = SessionUtils.getLoginUsername(request);

	    ChangePasswordForm form = new ChangePasswordForm();
	    BeanUtils.populate(form, request.getParameterMap());

	    request.setAttribute("username", username);

	    if (!form.getConfirmPassword().equals(form.getPassword())) {
		request.setAttribute("error", "New pass and confirm pass are different");

	    } else {
		UserDAO dao = new UserDAO();
		dao.changePassword(form.getId(), form.getCurrentPassword(), form.getPassword());
		request.setAttribute("message", "Password has been changed");
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	    request.setAttribute("error", e.getMessage());
	}
	PageInfo.prepareAndForwardSite(request, response, PageType.SITE_CHANGEPASS_PAGE);
    }

}
