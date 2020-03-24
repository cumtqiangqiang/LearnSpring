package com.cn.statcfactory.test;

import com.cn.statcfactory.ISomeService;
import com.cn.statcfactory.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fiona on 2020/3/13.
 */
public class MyTest {
    @Test
    public void  test(){
        String path = "com/cn/statcfactory/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(path);
        ISomeService s=  (SomeServiceImpl)ac.getBean("myService");
        s.doSomething();
    }
}
