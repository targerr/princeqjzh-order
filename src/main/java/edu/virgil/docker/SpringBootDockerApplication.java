package edu.virgil.docker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class SpringBootDockerApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringBootDockerApplication.class, args);
//    }
//
//}




@SpringBootApplication
@MapperScan("edu.virgil.docker.mapper")
public class SpringBootDockerApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
        return springApplicationBuilder.sources(SpringBootDockerApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }


}