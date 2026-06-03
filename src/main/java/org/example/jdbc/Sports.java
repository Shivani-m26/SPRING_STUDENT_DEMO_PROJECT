package org.example.jdbc;

public class Sports implements Lectures {

    @Override
    public void learn_indoor(){
        System.out.println("learning outdoor sports");
    }
    @Override
    public void study_math() {
        System.out.println("solve problems via playing");
    }

    @Override
    public void study_economics() {
        System.out.println("learn abt the national sport of the country");
    }

}
