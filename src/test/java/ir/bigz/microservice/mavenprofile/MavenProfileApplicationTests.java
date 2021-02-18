package ir.bigz.microservice.mavenprofile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MavenProfileApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("Testing App")
	public void testApp() {
		assertEquals(1, 1);
	}

}
