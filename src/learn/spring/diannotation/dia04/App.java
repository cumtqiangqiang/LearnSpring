package learn.spring.diannotation.dia04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by fiona on 2020/3/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class App {
    @Test
    public void  Test(){

        String resource = "learn/spring/diannotation/dia03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        Student student = (Student) ac.getBean("myStudent");

        System.out.println(student);


    }

}
