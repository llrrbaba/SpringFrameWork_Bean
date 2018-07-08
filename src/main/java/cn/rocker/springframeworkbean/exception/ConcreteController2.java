package cn.rocker.springframeworkbean.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rocker
 * @version V1.0
 * @Description:
 * @date 2018/7/8 19:22
 */
@Controller
public class ConcreteController2 {

    @RequestMapping("/codeWithExceptionWa")
    public String codeWithException(){
        if(true){
            throw new RuntimeException();
        }
        return "exception found...";
    }

}
