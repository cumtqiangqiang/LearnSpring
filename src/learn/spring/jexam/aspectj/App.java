package learn.spring.jexam.aspectj;

import learn.spring.jexam.aspectj.service.BuyStockException;
import learn.spring.jexam.aspectj.service.IBuyStockService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fiona on 2020/4/1.
 */
public class App {
    IBuyStockService sc1;
    @Before
    public void test(){
        String resource = "learn/spring/jexam/aspectj/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        sc1 = (IBuyStockService)ac.getBean("buyStockService");
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