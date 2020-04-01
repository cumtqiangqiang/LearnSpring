package learn.spring.jdbc.service;

import learn.spring.jdbc.beans.Student;

import java.util.List;

/**
 * Created by fiona on 2020/4/1.
 */
public interface IStudentService {
    void addStudent(Student student);
    void removeById(int id);
    void modifyStudent(Student student);

    List<String> findAllStudentNames();
    String findStudentNameById(int id);

    List<Student> findAllStudents();
    Student findStudentById(int id);
}
