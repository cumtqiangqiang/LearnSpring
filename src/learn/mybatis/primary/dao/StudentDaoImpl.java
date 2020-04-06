package learn.mybatis.primary.dao;

import learn.mybatis.primary.beans.Student;
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
// 加载主配置文件
            InputStream inputStream = Resources.getResourceAsStream("learn/mybatis/primary/mybatis.xml");
//            创建sqlSessionFactory
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
//            创建sqlSession 对象
            sqlSession = build.openSession();
//            不加namespace的话需要给sql不同的id.
            sqlSession.insert("test.insertStu",student);


            sqlSession.commit();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (sqlSession != null){
                sqlSession.close();
            }
        }


    }
}
