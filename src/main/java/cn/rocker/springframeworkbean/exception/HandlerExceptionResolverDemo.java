package cn.rocker.springframeworkbean.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author rocker
 * @version V1.0
 * @Description:    返回错误视图
 * @date 2018/7/8 20:54
 */
//@Component
public class HandlerExceptionResolverDemo implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        return new ModelAndView("500");
    }
}
