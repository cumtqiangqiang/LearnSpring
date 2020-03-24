package learn.spring.di.di09;

/**
 * Created by fiona on 2020/3/20.
 */
public class Student {
    private String name;
    private int age;
    private String school;
    private String department;

    public void setSchool(String school) {
        this.school = school;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student name:" + this.name + "->age:" + this.age + "->school:" + this.school + "->depart:" +
                this.department;
    }
}
