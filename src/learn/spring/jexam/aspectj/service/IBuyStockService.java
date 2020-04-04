package learn.spring.jexam.aspectj.service;

/**
 * Created by fiona on 2020/4/3.
 */
public interface IBuyStockService {
    void openAccount(String aname, double money);
    void openStock(String sname, int amount);
    void buyStock(String aname, double money, String sname, int amount) throws BuyStockException;
}
