FROM openjdk:17
EXPOSE 8082
ADD target/shippment-0.0.1-SNAPSHOT.jar docker-jenkins-shipment-application.jar
ENTRYPOINT ["java","-jar", "/docker-jenkins-shipment-application.jar"]