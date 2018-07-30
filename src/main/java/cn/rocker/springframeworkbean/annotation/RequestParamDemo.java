package cn.rocker.springframeworkbean.annotation;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author rocker
 * @version V1.0
 * @Description:    @RequestParam注解获取请求参数
 * @date 2018/7/8 13:48
 */
@RestController
@RequestMapping("getRequestParams")
public class RequestParamDemo {

    /**
     * 通过@RequestParam获取请求参数
     * REMIND 如果加上@RequestParam注解的话，请求体里必须带有相关请求参数(可以没有值)
     * REMIND 如果加上"required=false"，请求体里就可以不带相关参数
     * REMIND "value"可以将请求参数和方法入参进行映射
     * REMIND "defaultValue"可以给方法参数设置默认值
     */
    @PostMapping("/byRequestParamAnnotation")
    public String getRequestParamsByRequestParam(@RequestParam(defaultValue="123") String username,@RequestParam String password){
        System.out.println(username + ":" + password);
        return username + ":" + password;
    }


    /**
     * 通过原生HttpServletRequest获取请求参数
     */
    @PostMapping("/byOriginalRequest")
    public String getRequestParamsByRequest(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + ":" + password);
        return username + ":" + password;
    }

}
