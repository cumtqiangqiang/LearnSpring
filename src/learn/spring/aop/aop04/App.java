package learn.spring.aop.aop04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fiona on 2020/3/17.
 */
public class App {
    @Test
    public void  Test() {

        String resource = "learn/spring/aop/aop04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService sc1 = (ISomeService) ac.getBean("serviceProxy");
        try {
            sc1.login("qiang1","111");
        } catch (UserException e) {
            e.printStackTrace();
        }




    }
}
