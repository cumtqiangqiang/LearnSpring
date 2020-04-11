package learn.mybatis.crud6.selfinspect1.beans;

import java.util.Set;

/**
 * Created by fiona on 2020/4/10.
 */
public class NewsLabel {
    private Integer id;
    private String name;
    private Set<NewsLabel> chidLabels;

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

    public Set<NewsLabel> getChidLabels() {
        return chidLabels;
    }

    public void setChidLabes(Set<NewsLabel> chidLabes) {
        this.chidLabels = chidLabes;
    }

    @Override
    public String toString() {
        return "id:"+id+" name:"+name + " child:" + chidLabels.toString();
    }
}
