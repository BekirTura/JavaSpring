import Model.Calisan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by BeKiR on 05/02/2017.
 */
public class Main {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Calisan calisan =(Calisan)context.getBean("calisan");
        System.out.print(calisan.toString());
        ((ClassPathXmlApplicationContext)context).close();
    }
}
