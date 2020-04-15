FROM maven:3.6.3-jdk-14 AS build

COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package

FROM openjdk:14
COPY --from=build /usr/src/app/target/url-redirect-service-0.0.1-SNAPSHOT.jar /usr/app/url-redirect-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/app/url-redirect-service-0.0.1-SNAPSHOT.jar"]