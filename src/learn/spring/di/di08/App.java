package learn.spring.di.di08;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fiona on 2020/3/20.
 */
public class App {
    @Test
    public void Test() {

        String resource = "learn/spring/di/di08/spring-base.xml";
        String resource1 = "learn/spring/di/di08/spring-beans.xml";
        String resource2 = "learn/spring/di/di08/spring-*.xml";

        String [] resources = {resource,resource1};
//        ApplicationContext ac = new ClassPathXmlApplicationContext(resource,resource1);
//        ApplicationContext ac = new ClassPathXmlApplicationContext(resources);
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource2);
        Student student1 = (Student) ac.getBean("student1");

        System.out.println(student1);

        Student student2 = (Student) ac.getBean("student2");

        System.out.println(student2);

        Student student3 = (Student) ac.getBean("student3");

        System.out.println(student3);


    }

}
