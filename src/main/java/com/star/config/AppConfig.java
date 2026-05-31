package com.star.config;

import com.star.Alien;
import com.star.Computer;
import com.star.Desktop;
import com.star.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan ("com.star")
public class AppConfig  {

//    @Bean
//    //@Qualifier("laptop")
//    public Alien alien(@Autowired Computer com) { // We mentioner computer com2 because we didn't wanted to tightly copuled the desktop and alien.
//        Alien obj =  new Alien( );
//        obj.setAge(25);
//        obj.setCom(com); //Since mentioning desktop here, it was actually tightly coupled, So what we can do is, we will mention computer com in the constructor.
//        return obj;
//    }
//
//    @Bean //(name = {"Desktop1", "Beast", "RacingCar"})
//    @Scope ("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
