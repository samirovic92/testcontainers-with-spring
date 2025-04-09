# Spring Boot Testcontainers Demo

A demonstration project showing how to implement integration tests using Testcontainers with Spring Boot and PostgreSQL.

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Testcontainers
- Maven

## Prerequisites

- Java 17 or higher
- Docker
- Maven

## Project Structure

The project demonstrates:
- Integration testing with Testcontainers
- Spring Data JPA repository testing
- PostgreSQL container configuration

## Running Tests

Execute all tests using Maven:

```bash
mvn test
```

## Test Configuration

The project uses Testcontainers with PostgreSQL 16 (Alpine) for integration tests. The database container is automatically started before tests and destroyed afterward.
