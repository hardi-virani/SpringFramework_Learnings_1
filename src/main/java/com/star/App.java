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

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml"); // Step 7 : Created the spring container. And the configuration xml file is mentioned in the container ("Spring.xml"). // 11. And after editing xml file, spring knows what obj it needs from which class.

        // Communicated with the container. Just what we did in springBoot.
        Alien obj = (Alien) context.getBean("thisIstheID"); // The reason of writing "(Alien)" in this line is because spring is giving the type of obj from the container, so i need to write what type of object i want and that is Alien, so just need to typecast that.
        obj.code();

    }
}


// 1. Error : BreanFactory not initialized or already closed.....

// 2.  So, from the error is shows. "Alien obj = (Alien) context.getBean("alien");" it has problem with this line. Not above that. Spring was not able to find this object in the container.
// 3. So, we have to tell spring that it is your responsibility to manage this Alien class.
// 4. And there are many ways to talk to our spring. 1. Java based configuration, 2. XML , 3. Annotations
// 5. We will use XML here.

// 6. Step 1 : we create XML file but where?
// 7. Now since, we are using classpathXMLapplicationContext() it will look for classpath. And in classpath there is a main and let's create a folder called Resource. So it will look for it. And in that create XML file. I have name is Spring.xml.
// 8. Now mention that in classpathXMLapplicationContext("_yourxmlfilename_");
// 9. VISIT your created XML file. (make sure that resource folder the part of main folder)

// 10. SO, these are the things that we have to do, just to print one line of code in spring. WOW!!!



//ANOTHER DAY!!
// So see when the object is created, in line 29 or 32?
//Okay, so I made a constructor in Alien file. And simply printed "object created".

//SO, rather than too much detail, I will expplain the basic flow, so when i mention the XML file in line 29, it will visit our XML file and then check that we have asked spring to create the container and bean and it will create it and then iwe have mention Alien object with ID and package and class name and then it will visit that file get the obj and then print it.
// Here constructor in Alien file is the proof that it went to that file. because it is printing the constructor output even when we comment the 32 & 33 line.
// This is the basic flow of spring.

// Scope
// by default -> Singleton, and another is protoype there are many others which will be discuss in future.
// So for the scope it is because, how many different object ref. you make in main class, those all with reffee or point to one obj, because in XML we have mention that, but if we want 2 different objects. There are of course 2 ways.
//1. you resuse the code of bean and mention the ID and stuff like that and you get the 2 objs. But that would ineffiecient.
// Another way is scope, you mention the scope in the bean and name is prototype you get 2 different objects, rather than reusing the same code again and again. There many other scopes but we are using this only. By default it is singleton, which we have been using till now, 1 object.
// Practical usage will be done afterwards.