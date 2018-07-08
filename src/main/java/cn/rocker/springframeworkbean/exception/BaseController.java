package cn.rocker.springframeworkbean.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rocker
 * @version V1.0
 * @Description:    在基类中提供对异常的处理
 *                    好处：每个Controller继承该基类，如果抛出异常，就可以被基类中的异常处理解决
 *                    缺点：增加代码的耦合性，所有的Controller都要去继承该基类，否则异常信息会直接抛出
 * @date 2018/7/8 18:06
 */
//@RestController
public class BaseController {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e){
        e.printStackTrace();
        return "exception resolved...";
    }

}
