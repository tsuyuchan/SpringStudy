package aop;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyBook {
    public void before1(){
        System.out.println("前置增强...........");
    }
    public void after1(){
        System.out.println("后置增强...........");
    }
    //环绕通知
    public void around1(ProceedingJoinPoint joinPoint){
        //方法之前
        System.out.println("方法之前...........");
        //执行增强方法
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        //方法之后
        System.out.println("方法之后...........");
    }
}
