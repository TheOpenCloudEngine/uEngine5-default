package org.uengine.five;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by uengine on 2017. 11. 9..
 */
public class SessionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        //session 유효 검증

    }

    @Override
    public void destroy() {

    }
}
