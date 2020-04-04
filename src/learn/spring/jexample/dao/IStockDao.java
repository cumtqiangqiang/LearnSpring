package learn.spring.jexample.dao;

/**
 * Created by fiona on 2020/4/3.
 */
public interface IStockDao {
    void insertStock(String sname,int count);
    void updateStock(String sname,int count,boolean isBuy);
}
