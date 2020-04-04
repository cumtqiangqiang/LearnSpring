package learn.spring.jexam.annotation.service;

/**
 * Created by fiona on 2020/4/3.
 */
public class BuyStockException extends Exception {
    public BuyStockException() {
    }

    public BuyStockException(String message) {
        super(message);
    }
}
