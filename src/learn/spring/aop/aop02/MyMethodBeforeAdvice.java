package learn.spring.aop.aop02;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {

        System.out.println("前置通知....");

    }
}
