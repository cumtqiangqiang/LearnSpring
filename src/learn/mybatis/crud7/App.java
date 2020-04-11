package learn.mybatis.crud7;


import learn.mybatis.crud7.beans.Student;
import learn.mybatis.crud7.dao.IStudentDao;
import learn.mybatis.crud7.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by fiona on 2020/4/5.
 */
public class App {

    private IStudentDao studentDao;
    private SqlSession sqlSession;
    @Before
    public void before(){
        sqlSession = MybatisUtils.getSqlSession();
        studentDao = sqlSession.getMapper(IStudentDao.class);


    }

    @After
    public void after(){
        if (sqlSession!= null){
            sqlSession.close();
        }
    }


    @Test
    public void test1(){

        Student student =   studentDao.selectStudentById(1);
        System.out.println(student);

    }




}
