package learn.mybatis.primary2.dao;

import learn.mybatis.primary2.beans.Student;
import learn.mybatis.primary2.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by fiona on 2020/4/5.
 */
public class StudentDaoImpl implements IStudentDao {

    private SqlSession sqlSession;
    public void insertStud(Student student) {

        try {

            SqlSession sqlSession = MybatisUtils.getSqlSession();
            sqlSession.insert("test.insertStu",student);


            sqlSession.commit();

        }finally {
            if (sqlSession != null){
                sqlSession.close();
            }
        }


    }
}
