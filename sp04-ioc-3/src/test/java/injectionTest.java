import com.zac.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class injectionTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        Student std1 = (Student) ctx.getBean("stud1");
        Student std2 = (Student) ctx.getBean("stud1");
        System.out.println(std1==std2);

    }
}
