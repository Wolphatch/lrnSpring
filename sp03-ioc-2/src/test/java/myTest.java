import com.zac.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("beam.xml");
        User user = (User) context.getBean("bieming2");
        user.show();
    }
}
