package learn.mybatis.crud;

import learn.mybatis.crud.beans.Student;
import learn.mybatis.crud.dao.IStudentDao;
import learn.mybatis.crud.dao.StudentDaoImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Created by fiona on 2020/4/5.
 */
public class App {

    private IStudentDao studentDao;

    @Before
    public void before(){
        studentDao = new StudentDaoImpl();

    }

    @Test
    public void testInsert(){

        Student student = new Student("tom3",21,99);
        student.setId(2);
        studentDao.insertStudent(student);

    }
    @Test
    public void test1(){

        Student student = new Student("张强",26,97);
        System.out.println("插入前："+ student);

        studentDao.insertStudentCacheId(student);

        System.out.println("插入后："+ student);

    }
    @Test
    public void test2(){



        studentDao.deleteStudentById(25);


    }

    @Test
    public void test3(){


        Student student = new Student("tom",21,100);
        student.setId(3);
        studentDao.updateStudent(student);


    }
    @Test
    public void test4(){



       List<Student> students =  studentDao.selectAllStudents();
       if (students.size() > 0){
           for (Student student: students) {
               System.out.println(student);
           }
       }
    }

    @Test
    public void test5(){

        Map<String,Object> students =  studentDao.selectAllStudentsMap();
        System.out.println(students.get("tom"));

    }

    @Test
    public void test6(){

        Student student =  studentDao.selectStudentById(1);
        System.out.println(student);

    }
    @Test
    public void test7(){

        List<Student> students =   studentDao.selectStudentsByName("tom");
        if (students.size() > 0){
            for (Student student: students) {
                System.out.println(student);
            }
        }

    }
}
