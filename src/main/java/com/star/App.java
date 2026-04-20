// START READING FROM HERE, Then follow steps and then number in this file.
// Check by running code at everystage to not have major bug in future.
// Since this is springframework, we are going to learn what going on behind the scene.

// Tech work
// Step 1 : I want my spring to create this (obj) object for me. And we already saw how simple it is in springBoot, but NOW we are going to see what's happening behind the scene, basically in springFramework.
// Step 2 : As we know we have IOC container where spring stored and managed the objects. We will make that first, So that spring can stored it.
// Step 3 : we need container and it the part of the springframework not java. So we need to check some dependecies basically a spring library which is in fild "pom.xml".
// Step 4 : Just search in broweser MVN repoitry search for spring context and go with second last version because it is not constantly updating. So pretty easy to work with while learning. Copy the dependency and paste it in pom.xml. And after that there will be loadMaven changes appear at the upper right in your code space just load it. And in enternal libraries, you will be seen maven loads, spring dependencies.
// Step 5 : In future we will work with MVC and JPA, for that we need to get more other dependencies, there are just we need to work with DI using springframework, we need these dependencies only.
// Step 6 : Now back to our topic of making the container, and for that we already know from springBoot that we need ApplicationContext because that will be our way to reach to IOC container.
// Step 7 : Check the code comment.
// Step 8 : After doing all these we still get the error, check below.

package com.star;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");


        Alien obj1 = (Alien) context.getBean("thisIstheID");
//        obj1.setAge(21); // What if i don't want to assign the value here.
        System.out.println(obj1.getAge());
//        obj1.code();

        //Ref Attribute prac
        Alien objref = (Alien) context.getBean("thisIstheID");
        objref.code();

//        Alien obj2 = (Alien) context.getBean("thisIstheID");
//        System.out.println(obj2.age);

    }
}



