import com.zac.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    public static void main(String[] args) {
        //获取spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beams.xml");
        //
        Hello hello = (Hello) context.getBean("hello");

        System.out.println(hello.toString());
    }
}
