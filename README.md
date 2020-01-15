# SpringBootTest

Roadmap:
--------

* [X]init a new spring boot application

```
mvn spring-boot:run
```

* [X]test any autowire service (injection into the application)
* [X]test ad hoc polymophisme with Type class and ADT
* []test access to any DB -- optional
* []test access to any Queue
* []delivery as container (https://spring.io/guides/gs/spring-boot-docker/)

Build the application
```
 mvn package && java -jar target/SpringBootTest-0.1-SNAPSHOT.jar
```



Note:
-----

* the main class should not be placed in the default package
* the main class should be indicated in the spring-boot-maven-plugin
