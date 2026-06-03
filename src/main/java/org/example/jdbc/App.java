package org.example.jdbc;

<<<<<<< HEAD
=======
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

>>>>>>> 631c18a202fc5deb3d463f09f6f3de353999d202
/**
 * Hello world!
 *
 */
<<<<<<< HEAD
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
=======
>>>>>>> 631c18a202fc5deb3d463f09f6f3de353999d202
public class App 
{
    public static void main( String[] args )
    {
<<<<<<< HEAD

      ApplicationContext context=SpringApplication.run(App.class,args);
        Library obj=context.getBean(Library.class);
        obj.manage_lib();
=======
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


>>>>>>> 631c18a202fc5deb3d463f09f6f3de353999d202

    }
}
