FROM openjdk:23-jdk-slim
ARG JAR_FILE=10-api-gateway/target/*.jar
COPY ${JAR_FILE} gatewayApp.jar
RUN bash -c 'touch /gatewayApp.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/gatewayApp.jar"]