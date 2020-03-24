package com.cn.ba02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fiona on 2020/3/17.
 */
public class App {
    /**
     * bean 后处理器
     */
    @Test
    public void  Test(){

        String resource = "com/cn/ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService sc1 = (ISomeService) ac.getBean("myService");
        System.out.println( sc1.doSomething());

        System.out.println(sc1.doOtherthing());

    }
}
