package learn.mybatis.crud;

import learn.mybatis.crud.beans.Student;
import learn.mybatis.crud.dao.IStudentDao;
import learn.mybatis.crud.dao.StudentDaoImpl;
import org.junit.Before;
import org.junit.Test;

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

        Student student = new Student("白杨",26,99);
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



        studentDao.updateStudent();


    }
}
