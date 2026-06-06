package org.example.jdbc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication

public class App 
{
    public static void main( String[] args )
    {


      ApplicationContext context=SpringApplication.run(App.class,args);
        Library obj=context.getBean(Library.class);
        obj.manage_lib();

        //ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    Student st1=context.getBean(Student.class);

    // Student st2=context.getBean("std",Student.class);
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
