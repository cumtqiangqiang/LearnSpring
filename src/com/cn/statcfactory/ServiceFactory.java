package com.cn.statcfactory;

/**
 * Created by fiona on 2020/3/13.
 */
public class ServiceFactory {

    public static ISomeService getSomeService(){
        return new SomeServiceImpl();
    }

}
