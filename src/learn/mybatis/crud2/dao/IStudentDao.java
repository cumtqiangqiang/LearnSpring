package learn.mybatis.crud2.dao;

import learn.mybatis.crud2.beans.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by fiona on 2020/4/5.
 */
public interface IStudentDao {
     void  insertStudent(Student student);



    List<Student> selectAllStudents();

    Student selectStudentById(int id);


}
