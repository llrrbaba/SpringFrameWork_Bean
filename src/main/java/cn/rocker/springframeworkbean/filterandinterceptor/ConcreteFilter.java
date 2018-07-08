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
 * @Description:    具体过滤器
 * @date 2018/7/8 15:26
 */
@WebFilter(urlPatterns = {"/doWithFilterAndInterceptor"})
public class ConcreteFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        /**
         * ConcreteFilter过滤器调用之前
         */
        System.out.println("ConcreteFilter doFilter executed:" + request.getRequestURI());


        filterChain.doFilter(request,response);


        /**
         * ConcreteFilter过滤器调用之后
         */
        System.out.println("ConcreteFilter doFilter after:" + request.getRequestURI());
    }


}
