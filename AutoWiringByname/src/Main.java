import Model.Calistir;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by BeKiR on 05/02/2017.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Calistir c = (Calistir) context.getBean("calistir");
        c.EmCalistir();
        c.ImCalistir();

        ((ClassPathXmlApplicationContext)context).close();

    }
}
