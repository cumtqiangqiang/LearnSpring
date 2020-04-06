package learn.mybatis.primary;

import learn.mybatis.primary.beans.Student;
import learn.mybatis.primary.dao.IStudentDao;
import learn.mybatis.primary.dao.StudentDaoImpl;
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
        Logger.getLogger("org").setLevel(Level.ERROR);

    }

    @Test
    public void testInsert(){

        Student student = new Student("白杨",26,99);
        student.setId(2);
        studentDao.insertStud(student);

    }
}
