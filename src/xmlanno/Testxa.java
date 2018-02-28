package xmlanno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testxa {
    @Test
    public void testService(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean3.xml");
        BookService bookService=(BookService)context.getBean("bookService");
        bookService.add();
    }


}
