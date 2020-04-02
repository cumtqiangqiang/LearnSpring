package learn.spring.jdbc.dao;

import learn.spring.jdbc.beans.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Created by fiona on 2020/4/1.
 */
public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDao {

//  private JdbcTemplate template ;
    public StudentDaoImpl() {
        // 不能这样写 因为JdbcTemplate 是多例的 系统为每个线程创建一个tempate,方法用完即释放
//        template = this.getJdbcTemplate();
    }

    public void insertStudent(Student student) {
        String sql = "insert into student(id,name,age) values(?,?,?)";
        this.getJdbcTemplate().update(sql,student.getId(),student.getName(),student.getAge());
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
        String sql = "select name from student";
        return this.getJdbcTemplate().queryForList(sql,String.class);
    }

    public String selectStudentNameById(int id) {
        String sql = "select name from student where id = ?";
        return this.getJdbcTemplate().queryForObject(sql,String.class,id);
    }

    public List<Student> selectAllStudents() {
        String sql = "select id,age,name from student";
        return this.getJdbcTemplate().query(sql,new StudentRowMapper());
    }

    public Student selectStudentById(int id) {
        String sql = "select id,age,name from student where id = ?";
        return this.getJdbcTemplate().queryForObject(sql,new StudentRowMapper(),id);
    }
}
