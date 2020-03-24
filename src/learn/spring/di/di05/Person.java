package learn.spring.di.di05;

/**
 * Created by fiona on 2020/3/21.
 */
public class Person {
    private String pname;
    private int page;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Person name:" + this.pname + "->age:"+this.page;
    }

    public int computeAge(){
       return page > 25 ? 25:page;
    }
}
