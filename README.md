# SpringBootTest

Roadmap:
--------

* [X] init a new spring boot application

```
mvn spring-boot:run
```

* [X] test any autowire service (injection into the application)
* [X] test ad hoc polymophisme with Type class and ADT
* [ ] test access to any DB -- optional
* [ ] test access to any Queue
* [ ] keep the application running
* [X] delivery as container (https://spring.io/guides/gs/spring-boot-docker/)

Build the application
```
 mvn package && java -jar target/SpringBootTest-0.1-SNAPSHOT.jar
```

Add Dockerfile to the project root path
```
FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```

Build the docker image, tag it as syt/zoo-app-docker
```
docker build -t syt/zoo-app-docker .
```
Run the image instance
```
docker run -t syt/zoo-app-docker
```

* [X] Remote Debugging using IntelliJ

Debugging the application in a Docker container
```
docker run -e "JAVA_TOOL_OPTIONS=-agentlib:jdwp=transport=dt_socket,address=5005,server=y,suspend=n" -p 5005:5005 -t syt/zoo-app-docker
```

From IntelliJ, follow the instruction https://docs.alfresco.com/5.2/tasks/sdk-debug-intellij.html

Note:
-----

* the main class should not be placed in the default package
* the main class should be indicated in the spring-boot-maven-plugin
