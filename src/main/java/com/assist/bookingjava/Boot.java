package com.assist.bookingjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by frunza on 07.07.2017.
 */
@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class Boot {


    public static void main(String[] args) {
        SpringApplication.run(Boot.class, args);
    }

}

