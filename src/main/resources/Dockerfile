FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/income-service-docker.jar income-service-docker.jar 
ENTRYPOINT [ "java", "-jar", "/income-service-docker.jar" ]

