package com.poly.servlet.site;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Email;

import com.poly.common.EmailUtils;
import com.poly.common.PageInfo;
import com.poly.common.PageType;
import com.poly.dao.UserDAO;
import com.poly.domain.EmailSendForm;
import com.poly.model.User;

@WebServlet("/ForgotPass")
public class ForgotPassServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	PageInfo.prepareAndForwardSite(request, response, PageType.SITE_FORGOT_PASS_PAGE);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	try {
	    String emailAddress = request.getParameter("email");
	    String id = request.getParameter("id");
	    
	    UserDAO dao = new UserDAO();
	    User user = dao.findByIdandEmail(id, emailAddress);
		   
		    if(user==null) {
			request.setAttribute("error", "ID or Email is incorrect");
		    }else {
			EmailSendForm email = new EmailSendForm();
			email.setFrom("nguyenquocan2001789@gmail.com");
			email.setFromPassword("meoyeunhim201666");
			email.setTo(emailAddress);
			email.setSubject("Forgot Password Function");
			StringBuilder sb = new StringBuilder();
			sb.append("Dear ").append(id).append("<br>");
			sb.append("Your password is <br>").append(user.getPassword()).append("</br>");
			
			email.setContent(sb.toString());
			
			EmailUtils.send(email);
			
			request.setAttribute("message", "Email sent to the email address."
				+ " Please check mail and go login");
			
		    }
	    
	} catch (Exception e) {
	    e.printStackTrace();
	    request.setAttribute("error", e.getMessage());
	}
	PageInfo.prepareAndForwardSite(request, response, PageType.SITE_FORGOT_PASS_PAGE);
    }

}
