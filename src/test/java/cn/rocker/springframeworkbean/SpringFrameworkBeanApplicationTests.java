package cn.rocker.springframeworkbean;

import cn.rocker.springframeworkbean.bean.resource.AbstractService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringFrameworkBeanApplicationTests {

    @Resource(name = "concretService2")
    private AbstractService abstractService;

    @Test
    public void contextLoads() {
        abstractService.doService();
    }

}
