package com.cn.ba02;

/**
 * Created by fiona on 2020/3/11.
 */
public class SomeServiceImpl  implements ISomeService {

    SomeServiceImpl (){
        System.out.println("构造方法");
    }
    public String doSomething() {
        System.out.println("I am doing something");
        return "abcdef";
    }

    public String doOtherthing() {
        return "ghijk";
    }
}
