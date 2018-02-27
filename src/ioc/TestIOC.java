package ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
    @Test
    public void testUser(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService= (UserService) context.getBean("userService");
        userService.add();
    }
}
