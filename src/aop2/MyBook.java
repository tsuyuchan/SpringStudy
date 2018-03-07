package aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyBook {

    //在方法上面使用注解完成增强配置
    @Before(value = "execution(* aop2.Book.add(..))")
    public void before1(){
        System.out.println("前置增强...........");
    }

}
