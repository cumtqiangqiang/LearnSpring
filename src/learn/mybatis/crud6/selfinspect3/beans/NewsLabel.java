package learn.mybatis.crud6.selfinspect3.beans;

import java.util.Set;

/**
 * Created by fiona on 2020/4/10.
 */
public class NewsLabel {
    private Integer id;
    private String name;

    private NewsLabel parentLabel;

    public NewsLabel getParentLabel() {
        return parentLabel;
    }

    public void setParentLabel(NewsLabel parentLabel) {
        this.parentLabel = parentLabel;
    }


    public NewsLabel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "id:"+id+" name:"+name + " parent:" + parentLabel;
    }
}
