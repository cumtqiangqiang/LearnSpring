package learn.mybatis.crud.dao;

import learn.mybatis.crud.beans.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by fiona on 2020/4/5.
 */
public interface IStudentDao {
     void  insertStudent(Student student);
//     插入后获取它的自增id
    void insertStudentCacheId(Student student);

    void deleteStudentById(int id);
    void updateStudent(Student student);

    List<Student> selectAllStudents();
    Map<String,Object>selectAllStudentsMap();

    Student selectStudentById(int id);
    List<Student> selectStudentsByName(String name);

}
