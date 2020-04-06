package learn.mybatis.crud.dao;

import learn.mybatis.crud.beans.Student;
import learn.mybatis.crud.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

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

    public void insertStudentCacheId(Student student) {
        try {

            SqlSession sqlSession = MybatisUtils.getSqlSession();
            sqlSession.insert("insertStudentCacheId", student);

            sqlSession.commit();

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public void deleteStudentById(int id) {
        try {

            SqlSession sqlSession = MybatisUtils.getSqlSession();
            sqlSession.insert("deleteStudentById", id);

            sqlSession.commit();

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public void updateStudent(Student student) {
        try {

            SqlSession sqlSession = MybatisUtils.getSqlSession();
            sqlSession.update("updateStudent");

            sqlSession.commit();

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public List<Student> selectAllStudents() {
        return null;
    }

    public Map<String, Object> selectAllStudentsMap() {
        return null;
    }

    public Student selectStudentById(int id) {
        return null;
    }

    public List<Student> selectStudentsByName(String name) {
        return null;
    }
}
