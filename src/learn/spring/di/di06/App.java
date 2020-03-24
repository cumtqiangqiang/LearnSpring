package learn.spring.di.di06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fiona on 2020/3/20.
 */
public class App {
    @Test
    public void  Test(){

        String resource = "learn/spring/di/di06/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        Student student = (Student) ac.getBean("student");

        System.out.println(student);


    }

}
