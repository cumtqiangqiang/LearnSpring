package learn.mybatis.crud5.many2one2.beans;

public class Minister {
    private  Integer mid;
    private  String  mname;
    private Country country;
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }



    public Minister() {
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public String toString() {
        return "id:"+ mid + " name:"+mname + " country:" +country ;
    }
}
