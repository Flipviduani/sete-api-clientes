# sete-api-clientes

Spring Boot API for managing clients and subscription plans.

## Description

This project is a Spring Boot-based REST API for managing clients and their plans. It follows a layered architecture and uses plain JDBC (no Spring Data JPA) for database access.

## Key technologies

- Spring Boot: https://spring.io/projects/spring-boot
- Spring Web (REST): https://spring.io/projects/spring-framework
- JDBC (Java Database Connectivity): https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html
- Lombok: https://projectlombok.org/
- Swagger / OpenAPI: https://swagger.io/
- Docker: https://www.docker.com/
- Docker Compose: https://docs.docker.com/compose/
- PostgreSQL: https://www.postgresql.org/
- pgAdmin: https://www.pgadmin.org/

## Project structure (layered architecture)

The codebase is organized into packages by responsibility. Each layer has a clear role in the application:

- configurations
  - Holds application configuration classes (for example: Swagger/OpenAPI configuration, datasource configuration, bean definitions, and other framework-specific setup).

- controllers
  - Expose REST endpoints. Controllers handle incoming HTTP requests, perform basic validation, and delegate processing to the service layer. They are responsible for returning appropriate HTTP responses.

- entities
  - Define the domain objects that represent persisted data (POJOs that map to database structures). Since the project uses JDBC rather than JPA, these are plain Java objects used for persistence mapping.

- services
  - Contain the business logic of the application. Services orchestrate operations requested by controllers, apply domain rules, and coordinate persistence through the repository layer.

- dtos
  - Data Transfer Objects used for API input and output. DTOs decouple the external API contract from internal entity representations and help control what data is exposed.

- repositories
  - Responsible for direct database access. In this project repositories are implemented on top of JDBC (SQL queries, result mapping, and transaction handling where required) instead of using Spring Data JPA.

## Database and environment

The database runs in Docker using the repository's docker-compose.yml. The compose configuration defines a PostgreSQL service and a pgAdmin service for database administration.

## Links

- Spring Boot: https://spring.io/projects/spring-boot
- Spring Framework / Spring Web: https://spring.io/projects/spring-framework
- JDBC: https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html
- Lombok: https://projectlombok.org/
- Swagger / OpenAPI: https://swagger.io/
- Docker: https://www.docker.com/
- Docker Compose: https://docs.docker.com/compose/
- PostgreSQL: https://www.postgresql.org/
- pgAdmin: https://www.pgadmin.org/


> This README provides an overview of the project purpose, the main technologies used, and the responsibilities of each package layer. It intentionally omits run instructions and class-by-class descriptions.
