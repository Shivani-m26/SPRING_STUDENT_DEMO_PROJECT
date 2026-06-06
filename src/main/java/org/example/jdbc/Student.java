package org.example.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.beans.ConstructorProperties;

@Component
public class Student {

    private int age;

    // Reference type
    @Autowired
    private Lectures lectures;

    public Student() {
         System.out.println("student object");
    }

    @ConstructorProperties({"age", "subject"})
    public Student(int age, Lectures lectures) {
        this.age = age;
        this.lectures = lectures;

         System.out.println("student ref object");
    }

    public void manage() {
        System.out.println("student registered");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // System.out.println("calling setter");
        this.age = age;
    }

    public void setSubject(Lectures lectures) {
        this.lectures = lectures;
    }

    public void setSports(Lectures lectures) {
        this.lectures = lectures;
    }

    public Lectures getSubject() {
        return lectures;
    }

    public void study() {
        System.out.println("student is studying");

        lectures.study_math();
        lectures.study_economics();
        lectures.learn_indoor();
    }
}