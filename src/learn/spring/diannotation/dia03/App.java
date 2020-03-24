package learn.spring.diannotation.dia03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fiona on 2020/3/20.
 */
public class App {
    @Test
    public void  Test(){

        String resource = "learn/spring/diannotation/dia03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        Student student = (Student) ac.getBean("myStudent");

        System.out.println(student);


    }

}
