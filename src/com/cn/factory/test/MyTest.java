package com.cn.factory.test;

import com.cn.factory.ISomeService;
import com.cn.factory.ServiceFactory;
import com.cn.factory.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * Created by fiona on 2020/3/13.
 */
public class MyTest {
    @Test
    public void  test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISomeService s=  (SomeServiceImpl)ac.getBean("myService");
        s.doSomething();
    }
}
