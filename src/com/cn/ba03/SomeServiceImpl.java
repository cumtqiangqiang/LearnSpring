package com.cn.ba03;

/**
 * Created by fiona on 2020/3/11.
 */
public class SomeServiceImpl  implements ISomeService {


    SomeServiceImpl(){
        System.out.println("构造方法");
    }
    public void doSomething() {
        System.out.println("I am doing something");
    }

    public void setUp(){
        System.out.println("=======开始启动");

    }

    public void destory(){
        System.out.println("======Over");
    }
}
