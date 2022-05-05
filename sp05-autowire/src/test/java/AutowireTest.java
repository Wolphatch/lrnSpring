import com.zac.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

        Person person = ctx.getBean("person", Person.class);

        person.getDog().bark();
        person.getCat().bark();
    }
}
