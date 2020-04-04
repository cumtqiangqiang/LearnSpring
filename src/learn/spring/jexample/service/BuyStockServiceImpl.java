package learn.spring.jexample.service;

import learn.spring.jexample.dao.AcountDao;
import learn.spring.jexample.dao.IAcountDao;
import learn.spring.jexample.dao.IStockDao;
import learn.spring.jexample.dao.StockDao;

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


    public void openAccount(String aname, double money) {

        acountDao.insertAcount(aname,money);
    }

    public void openStock(String sname, int amount) {

        stockDao.insertStock(sname,amount);
    }

    public void buyStock(String aname, double money, String sname, int amount) throws BuyStockException{
        boolean isBuy = true;


        acountDao.updateAcount(aname,money,isBuy);

        if (1==1){
            throw new BuyStockException("购买错误");
        }
        stockDao.updateStock(sname,amount,isBuy);

    }
}
