package cn.rocker.springframeworkbean.exception;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rocker
 * @version V1.0
 * @Description:
 * @date 2018/7/8 18:07
 */
@RestController
public class ConcreteController1 extends BaseController{

    @RequestMapping("/codeWithExceptionHa")
    public String codeWithException(){
        if(true){
            throw new RuntimeException();
        }
        return "exception found...";
    }

}
