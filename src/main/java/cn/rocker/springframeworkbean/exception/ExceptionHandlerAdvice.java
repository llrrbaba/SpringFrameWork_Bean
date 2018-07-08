package cn.rocker.springframeworkbean.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rocker
 * @version V1.0
 * @Description:    全局异常处理类
 *                    如果不想通过继承基类来实现对异常的管理
 *                    可以通过创建一个ExceptionHandlerAdvice类，设置@ControllerAdvice注解
 *                    在该类中对异常进行处理
 * @date 2018/7/8 19:18
 */
@ResponseBody
@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e){
        e.printStackTrace();
        return "500";
    }

}
