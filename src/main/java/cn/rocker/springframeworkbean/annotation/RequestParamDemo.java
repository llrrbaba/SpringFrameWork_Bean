package cn.rocker.springframeworkbean.annotation;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author rocker
 * @version V1.0
 * @Description:    @RequestParam注解获取请求参数
 * @date 2018/7/8 13:48
 */
@RestController
public class RequestParamDemo {

    /**
     * 通过@RequestParam获取请求参数
     */
    @PostMapping("/getRequestParamsByRequestParam")
    public String getRequestParamsByRequestParam(@RequestParam("username") String username,@RequestParam("password") String password){
        System.out.println(username + ":" + password);
        return username + ":" + password;
    }


    /**
     * 通过原生HttpServletRequest获取请求参数
     */
    @PostMapping("/getRequestParamsByRequest")
    public String getRequestParamsByRequest(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + ":" + password);
        return username + ":" + password;
    }

}
