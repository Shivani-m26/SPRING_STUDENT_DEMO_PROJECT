package org.example.jdbc;

/**
 * Hello world!
 *
 */
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

    }
}
