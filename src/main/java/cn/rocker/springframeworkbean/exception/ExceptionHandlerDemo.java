package cn.rocker.springframeworkbean.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rocker
 * @version V1.0
 * @Description:
 * @date 2018/7/8 17:57
 */
//@RestController
public class ExceptionHandlerDemo {


    @RequestMapping("/codeWithException")
    public String codeWithException(){
        if(true){
            throw new RuntimeException();
        }
        return "test";
    }


    @ExceptionHandler(Exception.class)
    public String handleException(Exception e){
        e.printStackTrace();
       return "ok";
    }
}
