import com.zac.dao.UserDaoMySqlImpl;
import com.zac.service.UserService;
import com.zac.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        //调用serivce层的接口
//        UserService userService  = new UserServiceImpl();
//        //SET 使用哪个userdaoimpl
//        userService.setUserDao(new UserDaoMySqlImpl());
//        userService.getUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("beams.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
        userService.getUser();


    }
}
