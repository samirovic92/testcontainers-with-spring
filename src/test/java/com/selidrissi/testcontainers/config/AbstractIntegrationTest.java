package com.selidrissi.testcontainers.config;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
        //properties = {
        //        "spring.datasource.url=jdbc:tc:postgresql:16-alpine:///customer_db",
        //        "spring.datasource.driver-class-name=org.testcontainers.jdbc.ContainerDatabaseDriver",
        //}
)
public class AbstractIntegrationTest {

    @Container
    @ServiceConnection
    final static PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>("postgres:16-alpine");


}
