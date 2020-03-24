package com.cn.factory;

import com.cn.qiang.*;

/**
 * Created by fiona on 2020/3/13.
 */
public class ServiceFactory {

    public ISomeService getSomeService(){
        return new SomeServiceImpl();
    }

}
