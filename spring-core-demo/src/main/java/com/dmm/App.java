package com.dmm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

//        Student student1 = (Student) context.getBean("student1");
//        System.out.println(student1);

//        Student student2 = (Student) context.getBean("student2");
//        System.out.println(student2);

//        Student student3 = (Student) context.getBean("student3");
//        System.out.println(student3);

//        Employee employee = context.getBean("employee1", Employee.class);
//        System.out.println(employee);

//        Customer customer = (Customer) context.getBean("customer1");
//        System.out.println(customer);

//        User user = context.getBean("user1", User.class);
//        System.out.println(user);

//        Product product =(Product) context.getBean("product1");
//        System.out.println(product);

        Calculator calculator = (Calculator) context.getBean("calculator1");
        calculator.sum();

    }
}
