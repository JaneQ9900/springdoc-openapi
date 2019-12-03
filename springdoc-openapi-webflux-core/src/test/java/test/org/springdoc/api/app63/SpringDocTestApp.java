package test.org.springdoc.api.app63;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.springdoc", "test.org.springdoc.api.app63"})
public class SpringDocTestApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringDocTestApp.class, args);
    }
}
