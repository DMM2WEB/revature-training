package com.dmm;

import com.dmm.beans.Employee;
import com.dmm.beans.Student;
import com.dmm.beans.User;
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
//        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

//        Employee employee = context.getBean("employee", Employee.class);
//        System.out.println(employee);
//
//        Student student = context.getBean("student", Student.class);
//        System.out.println(student);
//
//        User user = context.getBean("user", User.class);
//        System.out.println(user);

        Employee employee1 =  context.getBean("employee", Employee.class);
        System.out.println(employee1.hashCode());

        Employee employee2 = context.getBean("employee", Employee.class);
        System.out.println(employee2.hashCode());
    }
}
