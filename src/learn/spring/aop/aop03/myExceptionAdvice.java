package learn.spring.aop.aop03;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by fiona on 2020/3/27.
 */
public class myExceptionAdvice  implements ThrowsAdvice{
    public void afterThrowing(Exception ex){
        System.out.println("异常通知");
    }
}
