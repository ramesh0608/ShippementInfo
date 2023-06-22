FROM openjdk:17
EXPOSE 8082
ADD target/docker-jenkins-shipment-application.jar docker-jenkins-shipment-application.jar
ENTRY POINT ["java","-jar", "/docker-jenkins-shipment-application.jar"]