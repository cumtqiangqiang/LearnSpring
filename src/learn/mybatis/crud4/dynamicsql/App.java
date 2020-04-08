package learn.mybatis.crud4.dynamicsql;

import learn.mybatis.crud4.dynamicsql.beans.Student;
import learn.mybatis.crud4.dynamicsql.dao.IStudentDao;
import learn.mybatis.crud4.dynamicsql.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
//通过多条件查询 根据map的key 找到数值
        Student stu = new Student("tom",19,96);

        List<Student> students =   studentDao.selectStudentsByConditionIf(stu);
        if (students.size() > 0){
            for (Student student: students) {
                System.out.println(student);
            }
        }

    }

    @Test
    public void test2(){
//通过多条件查询 根据map的key 找到数值
//        Student stu = new Student("tom",19,96);
        Student stu = new Student("",19,96);

        List<Student> students =   studentDao.selectStudentsByConditionWhere(stu);
        if (students.size() > 0){
            for (Student student: students) {
                System.out.println(student);
            }
        }

    }

    @Test
    public void test3(){
//通过多条件查询 根据map的key 找到数值
//        Student stu = new Student("tom",19,96);
//        Student stu = new Student("",19,96);
        Student stu = new Student("",0,96);

        List<Student> students =   studentDao.selectStudentsByConditionChoose(stu);
        if (students.size() > 0){
            for (Student student: students) {
                System.out.println(student);
            }
        }

    }

    @Test
    public void test4(){

        int ids[] = {1,2,4};
        List<Student> students =   studentDao.selectStudentsByConditionForeach(ids);
        if (students.size() > 0){
            for (Student student: students) {
                System.out.println(student);
            }
        }

    }
    @Test
    public void test5(){

        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);

        List<Student> students =   studentDao.selectStudentsByConditionForeach2(ids);
        if (students.size() > 0){
            for (Student student: students) {
                System.out.println(student);
            }
        }

    }

    @Test
    public void test6(){

        List<Student> ids = new ArrayList<Student>();
        Student stu1 = new Student();
        stu1.setId(1);
        Student stu2 = new Student();
        stu2.setId(2);
        Student stu3 = new Student();
        stu3.setId(3);
        ids.add(stu1);
        ids.add(stu2);
        ids.add(stu3);

        List<Student> students =   studentDao.selectStudentsByConditionForeach3(ids);
        if (students.size() > 0){
            for (Student student: students) {
                System.out.println(student);
            }
        }

    }


}
