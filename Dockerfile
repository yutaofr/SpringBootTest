FROM openjdk:8-jdk-alpine
RUN addgroup -S appRunnerGroup && adduser -S appRunner -G appRunnerGroup
USER appRunner:appRunnerGroup
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]