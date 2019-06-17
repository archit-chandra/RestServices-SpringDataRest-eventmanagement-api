package com.archit.eventmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

@SpringBootApplication
// NOTES: @EntityScan
//  1. It does not create beans,
//     only identifies which classes should be used by a specific persistence context.
//  2. Here, basePackageClasses refers the base packages which contains the listed classes
//  3. @ComponentScan annotation is used to automatically create beans for every class annotated with
//     @Component, @Service, @Controller, @RestController, @Repository, ...
//     and adds them to the Spring container (allowing them to be @Autowired).
@EntityScan(
        basePackageClasses = {
                EventmanagementApiApplication.class,
                // NOTES: Jsr310Converters
                //  1. for configuring java.time.*
                Jsr310Converters.class // for configuring java.time.*
        })
public class EventmanagementApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventmanagementApiApplication.class, args);
    }
}
