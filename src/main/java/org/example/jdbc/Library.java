package org.example.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Library {
    @Autowired
    Organisation organisation;
    @Qualifier
    Student student;
    public Library(Organisation organisation,Student student){
        this.organisation=organisation;
        this.student=student;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setOrganisation(Organisation organisation) {

        this.organisation = organisation;
    }
    public void manage_lib(){
        System.out.println("managing the organisation");
        organisation.manage();
        student.manage();


    }
}
