package learn.spring.diannotation.dia04;


/**
 * Created by fiona on 2020/3/20.
 */
public class School {
    private  String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name:" + this.name;
    }
}
