import model.Javaci;
import model.JavaciDAO;
import model.JavaciDAO2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by BeKiR on 05/02/2017.
 */
public class Main2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        JavaciDAO2 javaciDAO =(JavaciDAO2) context.getBean("javacidao2");
        javaciDAO.create(new Javaci(10,"Tr","güzel"));
        for (Javaci javaci: javaciDAO.javaciList()){
            System.out.print(javaci);
        }


        ((ClassPathXmlApplicationContext)context).close();
    }
}
