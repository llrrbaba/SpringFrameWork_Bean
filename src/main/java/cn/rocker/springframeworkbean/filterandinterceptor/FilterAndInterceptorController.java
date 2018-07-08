package cn.rocker.springframeworkbean.filterandinterceptor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rocker
 * @version V1.0
 * @Description:    被过滤器和拦截器控制的Controller
 * @date 2018/7/8 15:36
 */
@RestController
public class FilterAndInterceptorController {

    @GetMapping("/doWithFilterAndInterceptor")
    public String doWithFilterAndInterceptor(){
        System.out.println("FilterAndInterceptorController executed...");
        return "sss";
    }

}
