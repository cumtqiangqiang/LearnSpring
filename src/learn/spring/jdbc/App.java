package learn.spring.jdbc;

import learn.spring.aspectj.xml.ISomeService;
import learn.spring.jdbc.service.IStudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fiona on 2020/4/1.
 */
public class App {
    IStudentService sc1;
    @Before
    public void test(){
        String resource = "learn/spring/jdbc/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        sc1 = (IStudentService) ac.getBean("someService");
    }

    @Test
    public void Test1() {



    }
}