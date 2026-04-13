// Check by running code at everystage to not have major bug in future.
// 1. Since this is springframework, we are going to learn what going on behind the scene.

// Tech work
// Step 1 :  I want my spring to create this (obj) object for me. And we already saw how simple it is in springBoot, but NOW we are going to see what's happening behind the scene, basically in springFramework.
// Step 2 : As we know we have IOC container where spring stored and managed the objects. We will make that first, So that spring can stored it.



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
