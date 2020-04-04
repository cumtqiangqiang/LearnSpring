package learn.spring.jexam.annotation.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by fiona on 2020/4/3.
 */
public class StockDao extends JdbcDaoSupport implements IStockDao {
    public void insertStock(String sname, int count) {
        String sql = "insert into stock (name,count) values(?,?)";
        this.getJdbcTemplate().update(sql,sname,count);
    }

    public void updateStock(String sname, int count, boolean isBuy) {
       String sql = "update stock set count=count-? where name = ?";
       if (isBuy){
           sql = "update stock set count=count+? where name = ?";
       }

       this.getJdbcTemplate().update(sql,count,sname);

    }
}
