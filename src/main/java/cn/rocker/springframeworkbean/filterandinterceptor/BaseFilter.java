package cn.rocker.springframeworkbean.filterandinterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author rocker
 * @version V1.0
 * @Description:    基础过滤器
 * @date 2018/7/8 15:23
 */
@WebFilter(urlPatterns = {"/*"})
public class BaseFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        /**
         * BaseFilter过滤器调用之前
         */
        System.out.println("BaseFilter doFilter executed:" + request.getRequestURI());


        filterChain.doFilter(request,response);


        /**
         * BaseFilter过滤器调用之后
         */
        System.out.println("BaseFilter doFilter after:" + request.getRequestURI());
    }

}
