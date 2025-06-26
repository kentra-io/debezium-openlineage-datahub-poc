package io.kentra.javadbproducer;

import org.springframework.boot.SpringApplication;

public class TestJavaDbProducerApplication {

    public static void main(String[] args) {
        SpringApplication.from(JavaDbProducerApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
