package learn.spring.aop.aop04;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by fiona on 2020/3/27.
 */
public class myExceptionAdvice  implements ThrowsAdvice{
    public void afterThrowing(UserNameExcep ex){
        System.out.println("用户名异常通知:" +  ex.getMessage());
    }

    public void  afterThrowing(PasswordExcep ex){
        System.out.println("密码异常通知:" + ex.getMessage());
    }
//    处理其他异常
    public void  afterThrowing(Exception ex){
        System.out.println("密码异常通知:其他异常");
    }
}
