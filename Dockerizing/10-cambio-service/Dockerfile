FROM openjdk:23-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} cambioApp.jar
RUN bash -c 'touch /cambioApp.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cambioApp.jar"]