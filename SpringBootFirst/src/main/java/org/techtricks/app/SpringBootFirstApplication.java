package org.techtricks.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {


    public static void main(String[] args) {



        ApplicationContext context =  SpringApplication.run(SpringBootFirstApplication.class, args);


        Student obj = context.getBean(Student.class);
        obj.code();


    }

}
