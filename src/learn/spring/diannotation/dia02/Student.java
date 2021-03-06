package learn.spring.diannotation.dia02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by fiona on 2020/3/20.
 */

//@Scope(value = "prototype")
@Component(value = "myStudent")
public class Student {
    @Value("Tom")
    private String name;
    @Value("23")
    private  int age;
//    自动注入 通过byname 方式
    @Autowired
    @Qualifier("mySchool")
    private School school;


    public void setSchool(School school) {
        this.school = school;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student name:" + this.name + "->age:"+this.age + "->school:"+this.school;
    }
}
