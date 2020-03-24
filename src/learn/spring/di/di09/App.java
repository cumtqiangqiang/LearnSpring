package learn.spring.di.di09;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fiona on 2020/3/20.
 */
public class App {
    @Test
    public void Test() {

        String resource = "learn/spring/di/di09/applicationContext.xml";

        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        Student student1 = (Student) ac.getBean("student1");

        System.out.println(student1);

        Student student2 = (Student) ac.getBean("student2");

        System.out.println(student2);

        Student student3 = (Student) ac.getBean("student3");

        System.out.println(student3);


    }

}
