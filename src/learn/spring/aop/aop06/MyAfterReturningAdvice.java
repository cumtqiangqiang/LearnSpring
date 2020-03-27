package learn.spring.aop.aop06;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by fiona on 2020/3/27.
 */

/**
 * 后置通知可以获取其返回值 但没办法改变
 */
public class MyAfterReturningAdvice implements AfterReturningAdvice {

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

        System.out.println("后置通知");
        if (returnValue != null){

            System.out.println(returnValue);
        }

    }
}
