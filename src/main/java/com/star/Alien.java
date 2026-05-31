package com.star;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component

public class Alien {

    @Value("21")
    private int age;
//  private Laptop lid = new Laptop();

//    private Laptop lid;

    //Because we have created the interface called computer we can directly write like this. Instead of Laptop Lid
//    @Autowired
    private Computer com;

    public Alien() {
        System.out.println("Alien Object created");
    }

//    @ConstructorProperties({"age", "lid"})
//    public Alien(int age, Laptop lid) {
//        this.age = age;
//        this.lid = lid;
//    }

    // Age getter setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Setter is called");
        this.age = age;
    }

//    //LAPTOP getter setter
//    public Laptop getLap() {
//        return lid;
//    }
//
//    public void setLap(Laptop lid) {
//        this.lid = lid;
//    }


    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("desktop") //or @Qualifier("laptop")
    public void setCom(Computer com)  {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding");
        com.compile();
    }

}
