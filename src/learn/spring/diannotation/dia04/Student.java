package learn.spring.diannotation.dia04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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

    //通过JSR 标准，byname 方式注入
//    @Resource(name = "mySchool")
//    byType 方式
    @Resource
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
