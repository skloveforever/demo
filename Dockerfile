# Step 1: Build JAR
FROM maven:3.8.5-openjdk-8 AS build

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

# Step 2: Run JAR
FROM eclipse-temurin:8-jdk

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]