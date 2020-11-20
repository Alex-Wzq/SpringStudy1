import com.wzq.autowired.Parent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @org.junit.Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Parent hello = context.getBean("parent", Parent.class);
        System.out.println(hello.toString());
        System.out.println(hello.getSon());
    }
}
