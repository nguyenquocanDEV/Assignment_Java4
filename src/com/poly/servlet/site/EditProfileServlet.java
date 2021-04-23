package com.poly.servlet.site;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.poly.common.CookiesUtils;
import com.poly.common.PageInfo;
import com.poly.common.PageType;
import com.poly.common.SessionUtils;
import com.poly.dao.UserDAO;
import com.poly.model.User;

@WebServlet("/EditProfile")
public class EditProfileServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	String username = SessionUtils.getLoginUsername(request);
	if (username == null) {
	    request.getRequestDispatcher("/Login").forward(request, response);

	}
	try {
	    UserDAO dao = new UserDAO();
	    User user = dao.findId(username);
	    request.setAttribute("user", user);
	} catch (Exception e) {
	    e.printStackTrace();
	    request.setAttribute("error", e.getMessage());
	}
	PageInfo.prepareAndForwardSite(request, response, PageType.SITE_EDIT_PROFILE_PAGE);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	try {
	   
	    User user = new User();
	    BeanUtils.populate(user, request.getParameterMap());

	    String username = SessionUtils.getLoginUsername(request);
	    UserDAO dao = new UserDAO();
	    User olduser = dao.findId(username);

	    // không thay đổi role của user khi update
	    user.setAdmin(olduser.getAdmin());
	    user.setPassword(olduser.getPassword());

	   

	    dao.update(user);
	    request.setAttribute("message", "User updated !!");
	    request.setAttribute("user", user);

	} catch (Exception e) {
	    e.printStackTrace();
	    request.setAttribute("error", e.getMessage());
	}
	PageInfo.prepareAndForwardSite(request, response, PageType.SITE_EDIT_PROFILE_PAGE);
    }

}
