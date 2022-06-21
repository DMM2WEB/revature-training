package com.dmm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );

//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        context.registerShutdownHook();

//        Employee employee = (Employee) context.getBean("employee1");
//        System.out.println(employee);

//        Student student = (Student) context.getBean("student1");
//        System.out.println(student);

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);

    }
}
