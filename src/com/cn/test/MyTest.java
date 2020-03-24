package com.cn.test;

import com.cn.qiang.ISomeService;
import com.cn.qiang.SomeServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by fiona on 2020/3/11.
 */
public class MyTest {

    @Test
    public void test1(){
        ISomeService service = new SomeServiceImpl();
        service.doSomething();
    }

    @Test
    public void test2(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISomeService service = (SomeServiceImpl)ac.getBean("myService");
        service.doSomething();
    }

    @Test
    public void test3(){

        BeanFactory ac = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        ISomeService service = (SomeServiceImpl)ac.getBean("myService");
        service.doSomething();
    }

    @Test
    public void test4(){

        BeanFactory ac = new FileSystemXmlApplicationContext("test.xml");
        ISomeService service = (SomeServiceImpl)ac.getBean("myService");
        service.doSomething();
    }


}
