package org.example.jdbc;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Organisation {
    public void manage(){
        System.out.println("Managing the library");
    }
}
