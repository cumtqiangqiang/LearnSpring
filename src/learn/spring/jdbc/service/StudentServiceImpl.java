package learn.spring.jdbc.service;

import learn.spring.jdbc.beans.Student;
import learn.spring.jdbc.dao.IStudentDao;

import java.util.List;

/**
 * Created by fiona on 2020/4/1.
 */
public class StudentServiceImpl implements  IStudentService {
    IStudentDao studentDao;

    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void addStudent(Student student) {
        studentDao.insertStudent(student);

    }

    public void removeById(int id) {
        studentDao.deleteById(id);

    }

    public void modifyStudent(Student student) {
        studentDao.updateStudent(student);

    }

    public List<String> findAllStudentNames() {
        return studentDao.selectAllStudentNames();
    }

    public String findStudentNameById(int id) {
        return studentDao.selectStudentNameById(id);
    }

    public List<Student> findAllStudents() {
        return studentDao.selectAllStudents();
    }

    public Student findStudentById(int id) {
        return studentDao.selectStudentById(id);
    }
}
