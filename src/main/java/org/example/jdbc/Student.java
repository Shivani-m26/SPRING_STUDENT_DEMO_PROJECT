package org.example.jdbc;

import java.beans.ConstructorProperties;

public class Student {
    private int age;
    //referance type
    private Lectures lectures;



    public Student(){
        //System.out.println("studdent object ");
    }
    @ConstructorProperties({"age","suvject"})
    public Student(int age,Lectures lectures){
        this.age=age;
        this.lectures=lectures;

       // System.out.println("studnnet ref object");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //to check if setteer is called
       // System.out.println("calling setter");
        this.age = age;
    }

    public void setSubject(Lectures lectures) {

        this.lectures= lectures;
    }

    public void setSports(Lectures lectures){
        this.lectures=lectures;
    }

    public Lectures getSubject() {
        return lectures;

    }



    public void study(){
        System.out.println("studnet is studying");
        lectures.study_math();
        lectures.study_economics();
        lectures.learn_indoor();




    }

}
