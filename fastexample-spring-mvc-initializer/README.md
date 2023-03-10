# fastexample-spring-mvc-initializer
### Description
![example workflow](https://github.com/fastexample/spring/actions/workflows/maven.yml/badge.svg)

This module is a very limited Spring Web MVC project:
* It contains `ReflectController` class (being a `RestController`) that answers the `Long` value back it receives as
request parameter.
* It contains `WebApplicationConfig` class that implements `WebMvcConfigurer`
* It contains `WebApplicationInitializer` class that extends `AbstractAnnotationConfigDispatcherServletInitializer`. It
provides convenience methods so that you only have to provide details that you really need to add.

That is enough to start our very first Spring Web MVC example.

It differs from [fastexample-spring-mvc-initializer2](https://github.com/fastexample/spring/tree/main/fastexample-spring-mvc-initializer2)
that servlet configuration and registration does not have to be done by you. On the other hand component scan should be
initiated, and it takes place in `WebApplicationConfig`.

Content is similar to examples in https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-container-config
### Building
#### Requirements
* Java 17
* Maven 3

#### Build steps
In order to start build, run integration test and create the war file simply
`mvn clean install`

### Testing
#### Manual Testing
For manual testing download Apache Tomcat 10 (please note that Apache Tomcat 9 will not work) deploy the created war
file into Tomcat's webapps directory, start Tomcat the usual way (`/bin/startup.sh` or `/bin/startup.bat`).

In your favourite browser open `http://localhost:8080/fastexample-spring-mvc-initializer/10`

#### Integration Testing
Corresponding integration test file can be found under `test/java/...` directory.
