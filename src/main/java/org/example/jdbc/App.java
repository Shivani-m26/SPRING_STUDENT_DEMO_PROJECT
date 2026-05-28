package org.example.jdbc;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
       Student st1=(Student) context.getBean("std");

     Student st2=context.getBean("std",Student.class);
        st1.setAge(21);
       st1.study();
//        st2.study();
//        System.out.println(st1.getAge());
//
//        Subject s1=(Subject) context.getBean("sub");
//        s1.study_economics();
//        Subject s2=(Subject) context.getBean("sub");
//        s2.study_math();



    }
}
