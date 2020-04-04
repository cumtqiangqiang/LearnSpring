package learn.spring.jexam.aspectj.dao;

/**
 * Created by fiona on 2020/4/3.
 */
public interface IAcountDao {
    void insertAcount(String aname, double money);
    void updateAcount(String aname, double money, boolean isBuy);
}
