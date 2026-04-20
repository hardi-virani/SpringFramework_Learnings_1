package com.star;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;  //These are called primitive variables.
//  private Laptop lid = new Laptop(); But this is not how spring works. This what i as a person created. So what should we do get this lid object, we need to inject this lid reference through xml.

    private Laptop lid; // These are called reference, and of course because it is from Laptop class and being declared in Alien class.

    public Alien() {
        System.out.println("Object created");
    }

    @ConstructorProperties({"age", "lid"})
    public Alien(int age, Laptop lid) {
        this.age = age;
        this.lid = lid;
    }

    // Age getter setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter is called");
        this.age = age;
    }

    //LAPTOP getter setter
    public Laptop getLap() {
        return lid;
    }

    public void setLap(Laptop lid) {
        this.lid = lid;
    }

    public void code() {
        System.out.println("Coding");
        lid.compile();
    }

}
