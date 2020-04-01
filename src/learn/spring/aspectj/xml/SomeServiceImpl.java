package learn.spring.aspectj.xml;

/**
 * Created by fiona on 2020/3/11.
 */
public class SomeServiceImpl  implements ISomeService {

    SomeServiceImpl (){
        System.out.println("构造方法");
    }
    public void doFirst() {
        System.out.println("I am doing something");
    }

    public String doSecond() {
        System.out.println("do the second thing");
        return "abcde";
    }

    public void doThrid() {
        System.out.println("do the thrid thing");
//        System.out.println("do the thrid thing" + 3/0);
    }


}
