package cn.rocker.springframeworkbean.bean.resource;

import org.springframework.stereotype.Service;

/**
 * @author rocker
 * @version V1.0
 * @Description:
 * @date 2018/7/5 20:10
 */
@Service
public class ConcretService2 implements AbstractService{

    @Override
    public String doService() {
        System.out.println("ConcretService2");
        return null;
    }
}
