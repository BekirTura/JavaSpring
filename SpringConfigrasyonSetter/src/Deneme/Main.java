package Deneme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by BeKiR on 05/02/2017.
 */
public class Main {
    public static void  main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Adress adress = (Adress) context.getBean("adress2");
        System.out.print("Adress ****"+adress);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
