package com.poly.common;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.map.HashedMap;

public class PageInfo {
    public static Map<PageType, PageInfo> pageRoute = new HashedMap();
    static {
	// admin
	pageRoute.put(PageType.USER_MANAGEMENT_PAGE,
		new PageInfo("User Management", "/views/admin/users/users.jsp", null));
	pageRoute.put(PageType.REPORTS_MANAGEMENT_PAGE,
		new PageInfo("Reports", "/views/admin/reports/reports.jsp", null));
	pageRoute.put(PageType.VIDEO_MANAGEMENT_PAGE,
		new PageInfo("Video Management", "/views/admin/videos/videos.jsp", null));

	// site
	pageRoute.put(PageType.SITE_HOME_PAGE, new PageInfo("Home", "/views/site/home/home.jsp", null));
	pageRoute.put(PageType.SITE_LOGIN_PAGE, new PageInfo("Login", "/views/site/users/login.jsp", null));
	pageRoute.put(PageType.SITE_REGISTRATION_PAGE, new PageInfo("Registration", "/views/site/users/registration.jsp", null));
	pageRoute.put(PageType.SITE_CHANGEPASS_PAGE, new PageInfo("Change Password", "/views/site/users/change_password.jsp", null));
	pageRoute.put(PageType.SITE_EDIT_PROFILE_PAGE, new PageInfo("Edit Profile", "/views/site/users/edit_profile.jsp", null));
	pageRoute.put(PageType.SITE_FAVORITE_PAGE, new PageInfo("Favorite", "/views/site/videos/favorite.jsp", null));
	pageRoute.put(PageType.SITE_FORGOT_PASS_PAGE, new PageInfo("Forgot Password", "/views/site/users/forgot_password.jsp", null));
	pageRoute.put(PageType.SITE_SHARE_PAGE, new PageInfo("Share", "/views/site/videos/share.jsp", null));
	pageRoute.put(PageType.SITE_VIDEO_DETAIL_PAGE, new PageInfo("Video Detail", "/views/site/videos/detail.jsp", null));

    }

    public static void prepareAndForward(HttpServletRequest request, HttpServletResponse response, PageType pageType)
	    throws ServletException, IOException {
	PageInfo page = pageRoute.get(pageType);
	request.setAttribute("page", page);
	request.getRequestDispatcher("/views/admin/layout.jsp").forward(request, response);

    }

    public static void prepareAndForwardSite(HttpServletRequest request, HttpServletResponse response,
	    PageType pageType) throws ServletException, IOException {
	PageInfo page = pageRoute.get(pageType);
	request.setAttribute("page", page);
	request.getRequestDispatcher("/views/site/layout.jsp").include(request, response);

    }

    private String title;
    private String contentUrl;
    private String scriptUrl;

    public PageInfo(String title, String contentUrl, String scriptUrl) {
	super();
	this.title = title;
	this.contentUrl = contentUrl;
	this.scriptUrl = scriptUrl;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public String getContentUrl() {
	return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
	this.contentUrl = contentUrl;
    }

    public String getScriptUrl() {
	return scriptUrl;
    }

    public void setScriptUrl(String scriptUrl) {
	this.scriptUrl = scriptUrl;
    }

}
