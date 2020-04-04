package learn.spring.jexam.aspectj.beans;

public class Stock {
    private Integer sid;
//    股票名称
    private String sname;
//    股票数量
    private int count;

    public Stock(String sname, int count) {
        this.sname = sname;
        this.count = count;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
