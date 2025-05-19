package org.techtricks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )


    {


        //help to create a container
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


        Alien obj = (Alien) context.getBean("alien");
        obj.age = 12;
        System.out.println(obj.age);

       // obj.code();


        Alien obj1 = (Alien) context.getBean("alien");

        System.out.println(obj1.age);


        obj.code();
        //obj1.code();
    }
}
