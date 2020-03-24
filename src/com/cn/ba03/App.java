package com.cn.ba03;

import com.cn.ba03.ISomeService;
import com.cn.ba03.SomeServiceImpl;

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
    public void Test() {

        String resource = "com/cn/ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService sc1 = (SomeServiceImpl) ac.getBean("myService");
        sc1.doSomething();
//销毁方法的执行两个条件：当前bean 是singleton（单例），2是需要手工关闭
        ((ClassPathXmlApplicationContext)ac).close();

    }
}
