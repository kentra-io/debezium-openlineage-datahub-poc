package io.kentra.javadbproducer;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Component
public class RandomProductInserter {
    private final ProductRepository productRepository;
    private final Random random = new Random();

    public RandomProductInserter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostConstruct
    public void startInserting() {
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(() -> {
            Product product = new Product(
                    null,
                    "Product-" + random.nextInt(10000),
                    random.nextInt(10),
                    null
            );
            productRepository.save(product);
        }, 0, 2000, TimeUnit.MILLISECONDS);
    }
}
