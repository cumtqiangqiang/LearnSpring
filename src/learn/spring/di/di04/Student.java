package learn.spring.di.di04;

/**
 * Created by fiona on 2020/3/20.
 */
public class Student {
    private String name;
    private  int age;
//    对象属性
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
