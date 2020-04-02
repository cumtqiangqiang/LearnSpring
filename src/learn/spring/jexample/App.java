package learn.spring.jexample;

import learn.spring.jexample.beans.Student;
import learn.spring.jexample.service.IStudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by fiona on 2020/4/1.
 */
public class App {
    IStudentService sc1;
    @Before
    public void test(){
        String resource = "learn/spring/jdbc/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        sc1 = (IStudentService) ac.getBean("studentService");
    }

    @Test
    public void Test1() {
        Student stu = new Student(24,"Fiona");
        stu.setId(2);
        sc1.addStudent(stu);

    }
    @Test
    public void Test2() {

       List<String> names =  sc1.findAllStudentNames();
        System.out.println(names.toString());


    }
    @Test
    public void Test3() {
        String name = sc1.findStudentNameById(1);
        System.out.println(name);
    }

    @Test
    public void Test4() {
        List<Student> stus = sc1.findAllStudents();
        System.out.println(stus);
    }
    @Test
    public void Test5() {
        Student stus = sc1.findStudentById(1);
        System.out.println(stus);
    }
}