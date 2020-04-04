package learn.spring.jexample.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by fiona on 2020/4/3.
 */
public class AcountDao extends JdbcDaoSupport implements IAcountDao {
    public void insertAcount(String aname, double money) {
        String sql = "insert into account (name,balance) values(?,?)";
        this.getJdbcTemplate().update(sql,aname,money);
    }

    public void updateAcount(String aname, double money, boolean isBuy) {
        String sql = "update account set balance=balance+? where name = ?";
        if (isBuy){
            sql = "update account set balance=balance-? where name = ?";
        }

        this.getJdbcTemplate().update(sql,money,aname);
    }
}
