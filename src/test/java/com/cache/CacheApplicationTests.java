package com.cache;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.datasource.url=jdbc:h2:mem:cache-test")
class CacheApplicationTests {

	@Test
	void contextLoads() {
	}

}
