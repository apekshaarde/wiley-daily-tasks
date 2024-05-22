package com.main.pcg;

import com.main.pcg.config.AppConfig;
import com.main.pcg.service.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Phone phone = context.getBean(Phone.class);

        phone.browseInternet();


    }

}