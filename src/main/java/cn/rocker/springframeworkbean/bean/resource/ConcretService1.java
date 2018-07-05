package cn.rocker.springframeworkbean.bean.resource;

import org.springframework.stereotype.Service;

/**
 * @author rocker
 * @version V1.0
 * @Description:
 * @date 2018/7/5 20:08
 */
@Service
public class ConcretService1 implements AbstractService{

    @Override
    public String doService() {
        System.out.println("ConcretService1");
        return null;
    }
}
