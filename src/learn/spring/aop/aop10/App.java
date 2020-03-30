package learn.spring.aop.aop10;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fiona on 2020/3/17.
 */

/*
* 名称匹配方法切入点顾问
*
* */
public class App {
    @Test
    public void  Test(){

        String resource = "learn/spring/aop/aop10/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService sc1 = (ISomeService) ac.getBean("myService");
        sc1.doSomething();

        System.out.println("============");

        sc1.doSecond();
        System.out.println("=============");
        sc1.doThrid();




    }
}
