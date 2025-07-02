package io.kentra.javadbproducer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
@ActiveProfiles("test")
class JavaDbProducerApplicationTests {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void createAndReadProduct() throws InterruptedException {
        Product product = new Product(null, "Test Product", 123, null);
        Product saved = productRepository.save(product);

        assertThat(saved.id()).isNotNull();
        assertThat(saved.name()).isEqualTo("Test Product");
        assertThat(saved.price()).isEqualTo(123);

        Product found = productRepository.findById(saved.id()).orElseThrow();
        assertThat(found.name()).isEqualTo(saved.name());
        assertThat(found.price()).isEqualTo(saved.price());
    }

}
