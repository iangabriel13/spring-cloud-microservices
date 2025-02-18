FROM openjdk:23-jdk-slim
ARG JAR_FILE=10-book-service/target/*.jar
COPY ${JAR_FILE} bookApp.jar
RUN bash -c 'touch /bookApp.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/bookApp.jar"]