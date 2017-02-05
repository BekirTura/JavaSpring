import model.Javaci;
import model.JavaciDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by BeKiR on 05/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        JavaciDAO javaciDAO =(JavaciDAO) context.getBean("javacidao");
        System.out.print(javaciDAO.getJavaci(1));

        javaciDAO.createJavaci("Bet","tr");
        System.out.print("\nAll data \n");

        for (Javaci item:
                javaciDAO.javaciList()) {
            System.out.print(item);
        }


        ((ClassPathXmlApplicationContext)context).close();
    }
}
