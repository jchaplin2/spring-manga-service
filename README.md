# spring-manga-service
A simple rest controller that hits an endpoint that allows the user to search manga movies by title.

The purpose of this project shows how to do unit and integration tests in a spring boot environment.

I've updated the existing project to work with Java 11, and the v3 of the endpoint. I've also configured maven to run the unit tests and integration tests via separate goals.

You can read full article here : http://www.mgiglione.com/2018/07/14/unit-and-integration-tests-in-spring-boot/


## Requirements
For building and running the application you need:

- [JDK 1.11](https://www.oracle.com/java/technologies/javase-downloads.html#JDK11)
- [Maven 3](https://maven.apache.org)

## Running the application locally

You can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
