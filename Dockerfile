FROM maven:3.8.5-openjdk-17 as build
WORKDIR /build
COPY pom.xml pom.xml
COPY src src
RUN mvn package -DskipTests

FROM openjdk:17.0.2-slim-bullseye
COPY --from=build /build/target/getting-started-api-0.0.1.jar getting-started-api.jar
ENTRYPOINT java -jar -XX:MaxRAMPercentage=90 -XX:+UseParallelGC /getting-started-api.jar