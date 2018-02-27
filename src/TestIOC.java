import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
    @Test
    public void testUser(){

        //加载spring配置文件，根据创建对象
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        //得到配置创建的对象
        Hello hello=(Hello) context.getBean("hello");
        System.out.println(hello);
        hello.test1();

    }
}
