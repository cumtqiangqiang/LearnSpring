package learn.spring.aspectj.annotation01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by fiona on 2020/3/31.
 */
@Aspect
public class MyAspect {
    @Before(value = "execution(* *..ISomeService.doFirst(..))")
   public  void  before(){
       System.out.println("执行前置通知");
   }

    @Before(value = "execution(* *..ISomeService.doFirst(..))")
    public  void  before(JoinPoint jp){
        System.out.println("执行前置通知 jp = " + jp);
    }

    @AfterReturning(value = "execution(* *..ISomeService.doSecond(..))",returning = "result")
    public void afterReturning(Object result){

        System.out.println("后置通知:"+result);

    }
    @Around(value = "execution(* *..ISomeService.doSecond(..))")
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

//    @AfterThrowing(value = "execution(* *..ISomeService.doThrid(..))")
//    public void myThrowing(){
//        System.out.println("异常通知");
//    }
//
////    捕获特定的异常..
//    @AfterThrowing(value = "execution(* *..ISomeService.doThrid(..))",throwing = "ex")
//    public void myThrowing(Exception ex){
//        System.out.println("异常通知" + ex.getMessage());
//    }
//
//
//    @After(value = "execution(* *..ISomeService.doThrid(..))")
//    public void myAfter(){
//        System.out.println("最终通知");
//    }


    @AfterThrowing(value = "doThirdPointCut()")
    public void myThrowing(){
        System.out.println("异常通知");
    }

    //    捕获特定的异常..
    @AfterThrowing(value = "doThirdPointCut()",throwing = "ex")
    public void myThrowing(Exception ex){
        System.out.println("异常通知" + ex.getMessage());
    }


    @After(value = "doThirdPointCut()")
    public void myAfter(){
        System.out.println("最终通知");
    }


//    定义一个切入点
    @Pointcut("execution(* *..ISomeService.doThrid(..))")
    public void doThirdPointCut(){}




}
