package learn.spring.di.di05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fiona on 2020/3/20.
 */
public class App {
    @Test
    public void  Test(){

        String resource = "learn/spring/di/di05/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);

        Person p =  (Person) ac.getBean("myPerson");

        Student student = (Student) ac.getBean("student");


        System.out.println(p);
        System.out.println(student);


    }

}
