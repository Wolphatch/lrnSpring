import com.zac.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.zac.pojo.Config;

public class JavaConfigTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        User usr = ctx.getBean("user",User.class);
        System.out.println(usr.toString());
    }
}
