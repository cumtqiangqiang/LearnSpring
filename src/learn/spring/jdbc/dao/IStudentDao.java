package learn.spring.jdbc.dao;

import learn.spring.jdbc.beans.Student;

import java.util.List;

/**
 * Created by fiona on 2020/4/1.
 */
//因为没有具体业务 所以这里和service层一样
public interface IStudentDao {
    void insertStudent(Student student);
    void deleteById(int id);
    void updateStudent(Student student);

    List<String> selectAllStudentNames();
    String selectStudentNameById(int id);

    List<Student> selectAllStudents();
    Student selectStudentById(int id);
}
