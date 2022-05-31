package com.dmm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import javax.security.auth.login.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting project..." );

        //create a configuration object
        Configuration configuration = new Configuration();

        //read the configuration and load in the object
        configuration.configure("hibernate.cfg.xml");

        //create factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        //open session
        Session session = sessionFactory.openSession();

        //begin transaction
        Transaction transaction = session.beginTransaction();

        //create object
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Mathew");
        employee.setEmail("m@mail.com");

        //save the object
        session.save(employee);
        //session.update(employee);
        //session.delete(employee);

        //commit
        transaction.commit();
        session.close();
    }
}
