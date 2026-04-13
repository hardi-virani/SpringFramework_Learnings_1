// Check by running code at everystage to not have major bug in future.
// 1. Since this is springframework, we are going to learn what going on behind the scene.

// Tech work
// Step 1 :  I want my spring to create this (obj) object for me. And we already saw how simple it is in springBoot, but NOW we are going to see what's happening behind the scene, basically in springFramework.
// Step 2 : As we know we have IOC container where spring stored and managed the objects. We will make that first, So that spring can stored it.
// Step 3 : we need container and it the part of the springframework not java. So we need to check some dependecies basically a spring library which is in fild "pom.xml".
// Step 4 : Just search in broweser MVN repoitry search for spring context and go with second last version because it is not constantly updating. So pretty easy to work with while learning. Copy the dependency and paste it in pom.xml.
// Step 5 :



package com.star;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien obj = new Alien();
        obj.code();

    }
}
