package learn.spring.aspectj.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by fiona on 2020/3/31.
 */
public class MyAspect {
   public  void  myBefore(){
       System.out.println("myBefore");
       System.out.println("执行前置通知");
   }

    public  void  myBefore(JoinPoint jp){
        System.out.println("执行前置通知 jp = " + jp);
    }

    public void myAfterReturning(Object result){

        System.out.println("后置通知:"+result);

    }
    public Object myAround(ProceedingJoinPoint pjp){
        System.out.println("环绕通知，执行前");
        try {
           Object obj =  pjp.proceed();
           System.out.println("环绕通知,执行后");
           if (obj != null){
//               可以改变返回值
               return ((String)obj).toUpperCase();
           }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return  null;
    }

    public void myThrowing(){
        System.out.println("异常通知");
    }

//    捕获特定的异常..
    public void myThrowing(Exception ex){
        System.out.println("异常通知" + ex.getMessage());
    }


    public void myAfter(){
        System.out.println("最终通知");
    }







}
