package learn.spring.diannotation.dia04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by fiona on 2020/3/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:learn/spring/diannotation/dia04/applicationContext.xml")
public class App {
    @Autowired
    private Student student;
    @Test
    public void  Test(){

        System.out.println(student);


    }

}
