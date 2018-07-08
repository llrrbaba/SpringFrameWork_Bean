package cn.rocker.springframeworkbean.exception;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rocker
 * @version V1.0
 * @Description:
 * @date 2018/7/8 20:01
 */
//@RestController
public class ErrorControllerDemo implements ErrorController {

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public String onError(){
        return "服务器异常";
    }
}
