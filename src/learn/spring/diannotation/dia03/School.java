package learn.spring.diannotation.dia03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by fiona on 2020/3/20.
 */
@Component(value = "mySchool")
public class School {
    @Value("Qinghua")
    private  String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name:" + this.name;
    }
}
