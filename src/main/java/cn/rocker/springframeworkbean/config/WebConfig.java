package cn.rocker.springframeworkbean.config;

import cn.rocker.springframeworkbean.Interceptor.CustomInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author rocker
 * @version V1.0
 * @Description:    1.配置类需加@Configuration，将配置的拦截器放到容器中
 * @date 2018/7/8 14:44
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {


    /**
     * 1.注册自定义的拦截器
     * 2.并设置拦截路径
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomInterceptor()).addPathPatterns("/getRequestParamsByRequestParam");
    }
}
