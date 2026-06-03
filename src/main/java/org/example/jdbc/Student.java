package org.example.jdbc;

<<<<<<< HEAD
import org.springframework.stereotype.Component;

@Component
public class Student {

    public void manage(){

        System.out.println("student registred");
    }
=======
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

>>>>>>> 631c18a202fc5deb3d463f09f6f3de353999d202
}
