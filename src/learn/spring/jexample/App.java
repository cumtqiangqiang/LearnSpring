package learn.spring.jexample;

import learn.spring.jexample.service.BuyStockException;
import learn.spring.jexample.service.IBuyStockService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by fiona on 2020/4/1.
 */
public class App {
    IBuyStockService sc1;
    @Before
    public void test(){
        String resource = "learn/spring/jexample/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        sc1 = (IBuyStockService)ac.getBean("serviceProxy");
    }

    @Test
    public void Test1() {
       sc1.openAccount("QiangQiang",10000);
       sc1.openStock("WanKe",0);

    }
    @Test
    public void Test2() throws BuyStockException {

//        try {
            sc1.buyStock("QiangQiang",2000,"WanKe",5);
//        } catch (BuyStockException e) {
//            e.printStackTrace();
//        }

    }

}