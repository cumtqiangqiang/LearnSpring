package learn.spring.di.di02;

/**
 * Created by fiona on 2020/3/20.
 */
public class Student {
    private String name;
    private  int age;

    public void setSchool(School school) {
        this.school = school;
    }

    private School school;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override

    public String toString() {
        return "Student name:" + this.name + "->age:"+this.age + "->school:"+this.school;
    }
}
