package learn.mybatis.crud5.many2one2.beans;

public class Country {
     private Integer cid;
     private String cname;



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



    @Override
    public String toString() {
        return "id:"+ cid + " name:"+cname ;
    }
}
