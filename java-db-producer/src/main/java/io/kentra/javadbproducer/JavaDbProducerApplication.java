package io.kentra.javadbproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@EnableJdbcRepositories(basePackageClasses = JavaDbProducerApplication.class)
@SpringBootApplication
public class JavaDbProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaDbProducerApplication.class, args);
    }

}
