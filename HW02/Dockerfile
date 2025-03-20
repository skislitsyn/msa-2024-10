FROM maven:3.8.3-openjdk-17 AS builder
WORKDIR /build
ADD ./hw-02-service .
RUN mvn --batch-mode -DskipTests package

FROM openjdk:17-alpine
WORKDIR /application
COPY --from=builder /build/target/hw-02-service-0.0.1-SNAPSHOT.jar application.jar
EXPOSE 8000
CMD ["java", "-jar", "application.jar"]
