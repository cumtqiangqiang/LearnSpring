package learn.spring.jdbc.dao;

import learn.spring.jdbc.beans.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student>{
//    rs: 当查询出的结果集后，框架会自动遍历结果集，每次遍历的一行数据 都会被放到这个方法的rs的参数中
//    这里的rs代表一行数据，并非所有查询结果。只要执行这个方法 说明这里的rs不是空的
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getInt("id"));
        student.setAge(resultSet.getInt("age"));
        student.setName(resultSet.getString("name"));

        return student;
    }
}
