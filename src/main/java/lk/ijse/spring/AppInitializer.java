package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.di.Gayan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();


        Gayan gayan = context.getBean(Gayan.class);
        System.out.println(gayan);
        gayan.chatWithSadamali();
    }
}
