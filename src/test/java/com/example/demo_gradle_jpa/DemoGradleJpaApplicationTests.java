package com.example.demo_gradle_jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
class DemoGradleJpaApplicationTests {
	@Autowired
	private DataSource dataSource;

	@Test
	void contextLoads() {
	}

	@Test
	void testHikariCPConnection() {
		try {
			Connection connection = dataSource.getConnection();
			System.out.print("Connection : ");
			System.out.println(connection);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
