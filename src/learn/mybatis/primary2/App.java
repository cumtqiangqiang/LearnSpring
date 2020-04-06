package learn.mybatis.primary2;

import learn.mybatis.primary2.beans.Student;
import learn.mybatis.primary2.dao.IStudentDao;
import learn.mybatis.primary2.dao.StudentDaoImpl;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
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
        studentDao.insertStud(student);

    }
}
