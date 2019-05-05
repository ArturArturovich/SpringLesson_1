package Lesson1HW;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.security.krb5.internal.APOptions;

public class Client {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext((AppConfig.class));
//        Vaccine vaccine = context.getBean("vaccine", Vaccine.class);
//        vaccine.doVaccine();
//    }
//}

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       Vaccine vaccine = context.getBean("vaccine", Vaccine.class);
        vaccine.doVaccine();

}}

