FROM openjdk:23-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} gatewayApp.jar
RUN bash -c 'touch /gatewayApp.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/gatewayApp.jar"]