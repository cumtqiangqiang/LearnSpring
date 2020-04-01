package learn.spring.aspectj.annotation01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fiona on 2020/3/17.
 */




public class App {
    @Test
    public void  Test(){

        String resource = "learn/spring/aspectj/annotation01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService sc1 = (ISomeService) ac.getBean("someService");
        sc1.doFirst();

        System.out.println("============");

        sc1.doSecond();

        System.out.println("=============");
        sc1.doThrid();





    }
}
