package com.poly.servlet.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poly.common.PageInfo;
import com.poly.common.PageType;

@WebServlet("/VideoManagementServlet")
public class VideoManagementServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	PageInfo.prepareAndForward(request, response, PageType.VIDEO_MANAGEMENT_PAGE);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

    }

}
