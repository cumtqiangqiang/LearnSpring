package learn.spring.aop.aop05;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by fiona on 2020/3/27.
 */
// 环绕通知
public class MyMethodInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("方法执行之前");
        Object obj =  methodInvocation.proceed();

        System.out.println("方法执行之后");
        if (obj != null){
             return ((String)obj).toUpperCase();
        }
        return obj;

    }
}
