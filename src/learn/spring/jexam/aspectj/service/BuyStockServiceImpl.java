package learn.spring.jexam.aspectj.service;

import learn.spring.jexam.aspectj.dao.AcountDao;
import learn.spring.jexam.aspectj.dao.StockDao;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by fiona on 2020/4/3.
 */
public class BuyStockServiceImpl implements IBuyStockService {

    private AcountDao acountDao;
    private StockDao stockDao;
    public void setAcountDao(AcountDao acountDao) {
        this.acountDao = acountDao;
    }

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }


    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public void openAccount(String aname, double money) {

        acountDao.insertAcount(aname,money);
    }

    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public void openStock(String sname, int amount) {

        stockDao.insertStock(sname,amount);
    }
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = BuyStockException.class)
    public void buyStock(String aname, double money, String sname, int amount) throws BuyStockException {
        boolean isBuy = true;


        acountDao.updateAcount(aname,money,isBuy);

        if (1==1){
            throw new BuyStockException("购买错误");
        }
        stockDao.updateStock(sname,amount,isBuy);

    }
}
