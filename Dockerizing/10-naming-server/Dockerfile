FROM openjdk:23-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} namingApp.jar
RUN bash -c 'touch /namingApp.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/namingApp.jar"]