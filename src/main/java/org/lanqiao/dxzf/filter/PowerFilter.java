package org.lanqiao.dxzf.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class PowerFilter
 */
//@WebFilter("/*.jsp")
public class PowerFilter implements Filter {

    /**
     * Default constructor. 
     */
    public PowerFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse) response;
		String url = req.getRequestURI();
		//System.out.println(url);
		HttpSession session = req.getSession();
		if(session.getAttribute("admin")==null) {//判断session是否存在
			//System.out.println(url.substring(url.lastIndexOf("/")+1));
			if(!url.substring(url.lastIndexOf("/")+1).equals("login.jsp")) { //如果当前页面不是登录页面则跳转到登录页面
				res.sendRedirect(req.getContextPath()+"/login");
			}
		}
		chain.doFilter(req, res);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
