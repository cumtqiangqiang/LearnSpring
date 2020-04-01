package learn.spring.jdbc.dao;

import learn.spring.jdbc.beans.Student;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Created by fiona on 2020/4/1.
 */
public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDao {
    public void insertStudent(Student student) {
        String sql = "insert into student(name,age) values(?,?)";
        this.getJdbcTemplate().update(sql,student.getName(),student.getAge());
    }

    public void deleteById(int id) {

        String sql = "delete from student where id = ?";
        this.getJdbcTemplate().update(sql,id);

    }

    public void updateStudent(Student student) {
        String sql = "update student set name = ?,age = ? where id = ?";
        this.getJdbcTemplate().update(sql,student.getName(),student.getAge(),student.getId());
    }

    public List<String> selectAllStudentNames() {
        return null;
    }

    public String selectStudentNameById(int id) {
        return null;
    }

    public List<Student> selectAllStudents() {
        return null;
    }

    public Student selectStudentById(int id) {
        return null;
    }
}
