package learn.spring.aop.aop09;

/**
 * Created by fiona on 2020/3/11.
 */
public class SomeServiceImpl  implements ISomeService {

    SomeServiceImpl (){
        System.out.println("构造方法");
    }
    public void doSomething() {
        System.out.println("I am doing something");
    }

    public void doSecond() {
        System.out.println("do the second thing");
    }

    public void doThrid() {
        System.out.println("do the thrid thing");
    }
}
