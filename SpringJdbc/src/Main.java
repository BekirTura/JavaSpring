import model.Javaci;
import model.JavaciDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by BeKiR on 05/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        JavaciDAO javaciDAO =(JavaciDAO) context.getBean("Javacilar");
        List<Javaci> list = javaciDAO.javacilar();
        for (Javaci item :
                list) {
            System.out.println(item);
        }
        ((ClassPathXmlApplicationContext)context).close();
    }
}
