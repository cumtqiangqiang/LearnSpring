package com.cn.ba02;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by fiona on 2020/3/17.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    // 初始化完毕之前
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {

        System.out.println("BeanBefore");
        return o;
    }
    // 初始化完毕之后
    public Object postProcessAfterInitialization(final Object bean, String s) throws BeansException {

        Object obj = Proxy.newProxyInstance(bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object invoke =  method.invoke(bean,args);

                        if ("doSomething".equals(method.getName())){
                            return ((String)invoke).toUpperCase();
                        }

                        return invoke;
                    }
                }

        );
        return obj;
    }
}
