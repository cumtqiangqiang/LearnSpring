package learn.mybatis.crud2.dao;

import learn.mybatis.crud2.beans.Student;
import learn.mybatis.crud2.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fiona on 2020/4/5.
 */
public class StudentDaoImpl implements IStudentDao {

    private SqlSession sqlSession;

    public void insertStudent(Student student) {

        try {

            SqlSession sqlSession = MybatisUtils.getSqlSession();
            sqlSession.insert("insertStu", student);

            sqlSession.commit();

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }


    }




    public List<Student> selectAllStudents() {
        List<Student> students = new ArrayList<Student>();
        try {

            SqlSession sqlSession = MybatisUtils.getSqlSession();
            students =  sqlSession.selectList("test2.selectAllStudents");

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

        return students;
    }



    public Student selectStudentById(int id) {
        Student student;
        try {

            SqlSession sqlSession = MybatisUtils.getSqlSession();
            student =  sqlSession.selectOne("test2.selectStudentById",id);

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

        return student;
    }


}
