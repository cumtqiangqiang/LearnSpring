package learn.mybatis.crud5.one2many2.beans;

import java.util.Set;

public class Country {
     private Integer cid;
     private String cname;

     private Set<Minister> ministers;

    public Country() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Set<Minister> getMinisters() {
        return ministers;
    }

    public void setMinisters(Set<Minister> ministers) {
        this.ministers = ministers;
    }

    @Override
    public String toString() {
        return "id:"+ cid + " name:"+cname + " miniters:" + ministers.toString();
    }
}
