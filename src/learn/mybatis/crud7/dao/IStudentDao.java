package learn.mybatis.crud7.dao;

import learn.mybatis.crud7.beans.Student;

/**
 * Created by fiona on 2020/4/11.
 */
public interface IStudentDao {
    Student selectStudentById(int id);
}
