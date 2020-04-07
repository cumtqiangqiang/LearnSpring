package learn.mybatis.crud3.mapper.dynamicProxy;

import learn.mybatis.crud3.mapper.dynamicProxy.beans.Student;
import learn.mybatis.crud3.mapper.dynamicProxy.dao.IStudentDao;
import learn.mybatis.crud3.mapper.dynamicProxy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
    public void testInsert(){

        Student student = new Student("Jack2",27,99);
        studentDao.insertStudent(student);
        sqlSession.commit();
    }
    @Test
    public void test1(){

        Student student = new Student("张强",26,97);
        System.out.println("插入前："+ student);

        studentDao.insertStudentCacheId(student);

        System.out.println("插入后："+ student);
        sqlSession.commit();

    }
    @Test
    public void test2(){
        studentDao.deleteStudentById(1);
        sqlSession.commit();
    }

    @Test
    public void test3(){


        Student student = new Student("Jack",26,100);
        student.setId(3);
        studentDao.updateStudent(student);
        sqlSession.commit();

    }
    @Test
    public void test4(){



       List<Student> students =  studentDao.selectAllStudents();
       if (students.size() > 0){
           for (Student student: students) {
               System.out.println(student);
           }
       }
    }

    @Test
    public void test5(){

        Map<String,Object> students =  studentDao.selectAllStudentsMap();
        System.out.println(students.get("tom"));

    }

    @Test
    public void test6(){

        Student student =  studentDao.selectStudentById(1);
        System.out.println(student);

    }
    @Test
    public void test7(){

        List<Student> students =   studentDao.selectStudentsByName("tom");
        if (students.size() > 0){
            for (Student student: students) {
                System.out.println(student);
            }
        }

    }


    @Test
    public void test8(){
//通过多条件查询 根据map的key 找到数值
        Student stu = new Student("tom",27,96);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("nameCondi","Jack");
        map.put("ageCondi",25);
        map.put("stu",stu);
        List<Student> students =   studentDao.selectStudentsByCondition(map);
        if (students.size() > 0){
            for (Student student: students) {
                System.out.println(student);
            }
        }

    }

    @Test
    public void test9(){
//通过多条件查询 根据方法参数u的index查询

        List<Student> students =   studentDao.selectStudentsByConditionIndex("Jack",25);
        if (students.size() > 0){
            for (Student student: students) {
                System.out.println(student);
            }
        }

    }
}
