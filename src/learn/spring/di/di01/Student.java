package learn.spring.di.di01;

import javax.print.DocFlavor;

/**
 * Created by fiona on 2020/3/20.
 */
public class Student {
    private String name;
    private  int age;
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
