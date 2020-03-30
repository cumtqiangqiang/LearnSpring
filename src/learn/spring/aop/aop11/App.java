package learn.spring.aop.aop11;

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

        String resource = "learn/spring/aop/aop11/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService sc1 = (ISomeService) ac.getBean("myService");
        sc1.doSomething();

        System.out.println("============");

        sc1.doSecond();
        System.out.println("=============");
        sc1.doThrid();

        System.out.println("-----------------------------");

        ISomeService sc2 = (ISomeService) ac.getBean("myService2");
        sc2.doSomething();

        System.out.println("============");

        sc2.doSecond();
        System.out.println("=============");
        sc2.doThrid();





    }
}
