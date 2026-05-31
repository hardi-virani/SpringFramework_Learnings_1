package com.star.config;

import com.star.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig  {

    @Bean (name = {"Desktop1", "Beast", "RacingCar"})
    public Desktop desktop() {
        return new Desktop();
    }
}
