package org.example.jdbc;

import org.example.jdbc.Lectures;
import org.springframework.stereotype.Component;

@Component
public class Subject implements Lectures {

    @Override
    public void study_math() {
        System.out.println("solve problems");
    }

    @Override
    public void study_economics() {
        System.out.println("learn abt the country");
    }

    @Override
    public void learn_indoor(){
        System.out.println("learning  indoor sports");
    }
}
