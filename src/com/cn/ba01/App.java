package com.cn.ba01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fiona on 2020/3/17.
 */
public class App {
    @Test
    public void  Test(){

        String resource = "com/cn/ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService sc1 = (SomeServiceImpl) ac.getBean("myService");
        sc1.doSomething();
        ISomeService sc2 = (SomeServiceImpl) ac.getBean("myService");
        sc2.doSomething();



    }
}
