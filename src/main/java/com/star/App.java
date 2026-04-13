// Check by running code at everystage to not have major bug in future.
// 1. Since this is springframework, we are going to learn what going on behind the scene.

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

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml"); // Step 7 : Created the spring container. And the configuration xml file is mentioned in the container ("Spring.xml"). // And after editing xml file, spring knows what obj it needs from which class.

        // Communicated with the container. Just what we did in springBoot.
        Alien obj = (Alien) context.getBean("thisIstheID"); // The reason of writing "(Alien)" in this line is because spring is giving the type of obj from the container, so i need to write what type of object i want and that is Alien, so just need to typecast that.
        obj.code();

    }
}


// Error : BreanFactory not initialized or already closed.....

// So, from the error is shows. "Alien obj = (Alien) context.getBean("alien");" it has problem with this line. Not above that. Spring was not able to find this object in the container.
// So, we have to tell spring that it is your responsibility to manage this Alien class.
// And there are many ways to talk to our spring. 1. Java based configuration, 2. XML , 3. Annotations
// We will use XML here.

// Step 1 : we create XML file but where?
// Now since, we are using classpathXMLapplicationContext() it will look for classpath. And in classpath there is a main and let's create a folder called Resource. So it will look for it. And in that create XML file. I have name is Spring.xml.
// Now mention that in classpathXMLapplicationContext("_yourxmlfilename_");
// Go to your created XML file. (make sure that resource folder the part of main folder)

// SO, these are the things that we have to do, just to print one line of code in spring. WOW!!!