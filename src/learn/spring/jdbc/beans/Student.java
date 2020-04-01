package learn.spring.jdbc.beans;

/**
 * Created by fiona on 2020/4/1.
 */
public class Student {
    private Integer id;
    private int age;
    private String name;
    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
