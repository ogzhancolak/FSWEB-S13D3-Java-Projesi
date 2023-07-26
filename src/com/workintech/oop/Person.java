package com.workintech.oop;

import java.util.Date;
import java.util.SimpleTimeZone;

public class Person {

    String firstname;
    String lastname;
    int age;
    String School;
    Date birthday;
    double lenght;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String School, Date birthday, double lenght) {
        this.School = School;
        this.birthday = birthday;
        this.lenght = lenght;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return(age >= 13 && age <= 19);
    }

}
