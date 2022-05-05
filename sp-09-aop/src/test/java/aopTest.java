
import com.zac.service.UserService;
import com.zac.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aopTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理代理的是接口，接口类型为UserService
        UserService userServiceImplInstance = (UserService) ctx.getBean("userService");
        userServiceImplInstance.update();

    }
}
