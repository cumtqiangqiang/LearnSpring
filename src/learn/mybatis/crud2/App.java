package learn.mybatis.crud2;

import learn.mybatis.crud2.beans.Student;
import learn.mybatis.crud2.dao.IStudentDao;
import learn.mybatis.crud2.dao.StudentDaoImpl;
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
    public void test4(){

       List<Student> students =  studentDao.selectAllStudents();
       if (students.size() > 0){
           for (Student student: students) {
               System.out.println(student);
           }
       }
    }




    @Test
    public void test6(){

        Student student =  studentDao.selectStudentById(1);
        System.out.println(student);

    }

}
