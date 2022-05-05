import com.zac.dao.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentTest {
    public static void main(String[] args) {
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
        User usr =  ctx.getBean("user", User.class);
        System.out.println(usr.username);
    }
}
