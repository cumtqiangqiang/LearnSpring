package learn.spring.aop.aop06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fiona on 2020/3/17.
 */
public class App {
    @Test
    public void  Test(){

        String resource = "learn/spring/aop/aop06/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
//        有接口的话是JDK 的proxy ，没有借口的话是CGLIB
        ISomeService sc1 = (ISomeService) ac.getBean("serviceProxy");
        sc1.doSomething();

        System.out.println("============");

        sc1.doSecond();





    }
}
