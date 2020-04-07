package learn.mybatis.crud.dao;

import learn.mybatis.crud.beans.Student;
import learn.mybatis.crud.utils.MybatisUtils;
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
            sqlSession.update("updateStudent",student);

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
            students =  sqlSession.selectList("selectAllStudents");

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

        return students;
    }

    public Map<String, Object> selectAllStudentsMap() {
       Map<String,Object> map = new HashMap<String, Object>();
        try {

            SqlSession sqlSession = MybatisUtils.getSqlSession();
//            第二个参数是bean的属性.
            map =  sqlSession.selectMap("selectAllStudents","name");

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return map;
    }

    public Student selectStudentById(int id) {
        Student student;
        try {

            SqlSession sqlSession = MybatisUtils.getSqlSession();
            student =  sqlSession.selectOne("selectStudentById",id);

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

        return student;
    }

    public List<Student> selectStudentsByName(String name) {
        List<Student> students = new ArrayList<Student>();
        try {

            SqlSession sqlSession = MybatisUtils.getSqlSession();
            students =  sqlSession.selectList("selectStudentsByName",name);


        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

        return students;
    }
}
