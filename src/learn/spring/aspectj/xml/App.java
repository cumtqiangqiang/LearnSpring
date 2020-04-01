package learn.spring.aspectj.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fiona on 2020/3/17.
 */




public class App {
    @Test
    public void  Test(){

        String resource = "learn/spring/aspectj/xml/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService sc1 = (ISomeService) ac.getBean("someService");
        sc1.doFirst();

        System.out.println("============");

        sc1.doSecond();

        System.out.println("=============");
        sc1.doThrid();





    }
}
