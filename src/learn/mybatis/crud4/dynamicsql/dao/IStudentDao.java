package learn.mybatis.crud4.dynamicsql.dao;

import learn.mybatis.crud4.dynamicsql.beans.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by fiona on 2020/4/5.
 */
public interface IStudentDao {

    //    根据多条件查询 根据参数的index 查询
    List<Student> selectStudentsByConditionIf(Student student);
    List<Student> selectStudentsByConditionWhere(Student student);
    List<Student> selectStudentsByConditionChoose(Student student);
    List<Student> selectStudentsByConditionForeach(int[] objs);
    List<Student> selectStudentsByConditionForeach2(List<Integer> objs);
//    自定义类型
    List<Student> selectStudentsByConditionForeach3(List<Student> objs);
}
